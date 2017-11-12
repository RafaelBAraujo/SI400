package model;

import exception.LoginException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tracks implements java.io.Serializable {

    private static final long serialVersionUID = -33415258586880387L;

    private List<Track> tracks;

    public Track getTrack(String trackName) {
        Track notFound = null;
        for (Track track : tracks) {
            if (track.getTrackName().compareTo(trackName) == 0) {
                return track;
            }
        }
        return notFound;
    }

    Tracks() {
        this.tracks = new ArrayList<>();
    }

    public void checkUpdate() throws LoginException {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openTrackList();
        DataBaseHandler DBHandler = DataBaseHandler.getConnection();

        List<WebElement> trackList = h.getDriver().findElements(
                By.cssSelector("table.styled.borderbottom.flag tbody tr"));

        try {

            java.sql.Statement st = DBHandler.dbConn.createStatement();
            ResultSet queryResult = st.executeQuery("SELECT COUNT(*) FROM Track");
            int totalRows = 0;
            while (queryResult.next()) {
                totalRows += queryResult.getInt(1);
            }

            System.out.println("Current number of tracks is: " + totalRows + ".");

            if (totalRows < trackList.size() - 1) {
                System.out.println("Track list is not updated!");
                System.out.println("Updating...");
                this.update(DBHandler.dbConn);
                DBHandler.dbConn.close();
            } else {
                DBHandler.dbConn.close();
            }

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        System.out.println("Track list is up to date!");
        DataBaseHandler.closeConnection();

    }

    public void update(Connection dbConn) throws LoginException {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openTrackList();
        List<WebElement> trackList = h.getDriver().findElements(
                By.cssSelector("table.styled.borderbottom.flag tbody td"));

        Track newTrack;

        int x = 0;
        for (int i = 0; i < ((trackList.size() + 1) / 10); i++) {

            List<WebElement> trackList2 = h.getDriver().findElements(
                    By.cssSelector("table.styled.borderbottom.flag tbody td"));

            newTrack = new Track();
            newTrack.setTrackName(trackList2.get(x).getText());
            newTrack.setLocation(trackList2.get(x + 1).getText());
            newTrack.setRaceDistance(trackList2.get(x + 2).getText());
            newTrack.setLaps(trackList2.get(x + 3).getText());
            newTrack.setLapDistance(trackList2.get(x + 4).getText());
            newTrack.setCategory(trackList2.get(x + 8).getText());
            newTrack.setGPHeld(trackList2.get(x + 9).getText());
            String trackURL = trackList2.get(x + 0).findElement(By.cssSelector("a")).getAttribute("href");
            String[] parts = trackURL.split(Pattern.quote("."));

            System.out.println(trackList2.get(x).getText());

            h.getDriver().findElement(By.xpath("//a[@href='TrackDetails." + parts[3] + "']")).click();

            List<WebElement> trackInfo = h.getDriver().findElements(
                    By.cssSelector("div.inner div table.styled tbody tr td table.styled.paddedsmall tbody tr td"));

            newTrack.setDate(trackInfo.get(7).getText());
            newTrack.setAvgSpeed(trackInfo.get(23).getText());
            newTrack.setNumOfCorners(trackInfo.get(31).getText());
            newTrack.setPitTime(trackInfo.get(35).getText());
            newTrack.setPower(trackInfo.get(5).getAttribute("title"));
            newTrack.setHandling(trackInfo.get(9).getAttribute("title"));
            newTrack.setAcceleration(trackInfo.get(13).getAttribute("title"));
            newTrack.setDownforce(trackInfo.get(17).getText());
            newTrack.setOvertaking(trackInfo.get(21).getText());
            newTrack.setSuspRigidity(trackInfo.get(25).getText());
            newTrack.setFuelConsumption(trackInfo.get(29).getText());
            newTrack.setTyreWear(trackInfo.get(33).getText());
            newTrack.setGripLevel(trackInfo.get(37).getText());

            x += 10;
            h.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
            h.openTrackList();
            this.tracks.add(newTrack);

        }

        System.out.println("Inserting into database...");
        this.insertIntoDataBase(dbConn);

    }

    public void insertIntoDataBase(Connection dbConn) {

        try {

            String query2 = "{call insertIntoTrack(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement st = dbConn.prepareCall(query2);

            for (int i = 0; i < this.tracks.size(); i++) {

                st.setString(1, tracks.get(i).getTrackName());
                st.setString(2, tracks.get(i).getLocation());
                st.setString(3, tracks.get(i).getRaceDistance());
                st.setString(4, tracks.get(i).getLaps());
                st.setString(5, tracks.get(i).getLapDistance());
                st.setString(6, tracks.get(i).getAvgSpeed());
                st.setString(7, tracks.get(i).getGPHeld());
                st.setString(8, tracks.get(i).getNumOfCorners());
                st.setString(9, tracks.get(i).getPitTime());
                st.setString(10, tracks.get(i).getPower());
                st.setString(11, tracks.get(i).getHandling());
                st.setString(12, tracks.get(i).getAcceleration());
                st.setString(13, tracks.get(i).getDownforce());
                st.setString(14, tracks.get(i).getOvertaking());
                st.setString(15, tracks.get(i).getSuspRigidity());
                st.setString(16, tracks.get(i).getFuelConsumption());
                st.setString(17, tracks.get(i).getTyreWear());
                st.setString(18, tracks.get(i).getGripLevel());
                st.setString(19, tracks.get(i).getCategory());
                st.execute();

            }
        } catch (SQLException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        System.out.println("Track list updated!");

    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
    
}
