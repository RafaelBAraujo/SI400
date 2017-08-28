package gproscraping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class Track {
	
	private String trackName;
	private String location;
	private String date;
	private String raceDistance;
	private String laps;
	private String lapDistance;
	private String avgSpeed;
	private String GPHeld;
	private String numOfCorners;
	private String pitTime;
	private String power;
	private String handling;
	private String acceleration;
	private String downforce;
	private String overtaking;
	private String suspRigidity;
	private String fuelConsumption;
	private String tyreWear;
	private String gripLevel;
	private String category;
	
	public void printTrack(){
		System.out.println(trackName);
		System.out.println(location);
		System.out.println(date);
		System.out.println(raceDistance);
		System.out.println(laps);
		System.out.println(lapDistance);
		System.out.println(avgSpeed);
		System.out.println(GPHeld);
		System.out.println(numOfCorners);
		System.out.println(pitTime);
		System.out.println(power);
		System.out.println(handling);
		System.out.println(acceleration);
		System.out.println(downforce);
		System.out.println(overtaking);
		System.out.println(suspRigidity);
		System.out.println(fuelConsumption);
		System.out.println(tyreWear);
		System.out.println(gripLevel);
		System.out.println(category + "\n\n");
	}
	
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRaceDistance() {
		return raceDistance;
	}
	public void setRaceDistance(String raceDistance) {
		this.raceDistance = raceDistance;
	}
	public String getLaps() {
		return laps;
	}
	public void setLaps(String laps) {
		this.laps = laps;
	}
	public String getLapDistance() {
		return lapDistance;
	}
	public void setLapDistance(String lapDistance) {
		this.lapDistance = lapDistance;
	}
	public String getAvgSpeed() {
		return avgSpeed;
	}
	public void setAvgSpeed(String avgSpeed) {
		this.avgSpeed = avgSpeed;
	}
	public String getGPHeld() {
		return GPHeld;
	}
	public void setGPHeld(String gPHeld) {
		GPHeld = gPHeld;
	}
	public String getNumOfCorners() {
		return numOfCorners;
	}
	public void setNumOfCorners(String numOfCorners) {
		this.numOfCorners = numOfCorners;
	}
	public String getPitTime() {
		return pitTime;
	}
	public void setPitTime(String pitTime) {
		this.pitTime = pitTime;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getHandling() {
		return handling;
	}
	public void setHandling(String handling) {
		this.handling = handling;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getDownforce() {
		return downforce;
	}
	public void setDownforce(String downforce) {
		this.downforce = downforce;
	}
	public String getOvertaking() {
		return overtaking;
	}
	public void setOvertaking(String overtaking) {
		this.overtaking = overtaking;
	}
	public String getSuspRigidity() {
		return suspRigidity;
	}
	public void setSuspRigidity(String suspRigidity) {
		this.suspRigidity = suspRigidity;
	}
	public String getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(String fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public String getTyreWear() {
		return tyreWear;
	}
	public void setTyreWear(String tyreWear) {
		this.tyreWear = tyreWear;
	}
	public String getGripLevel() {
		return gripLevel;
	}
	public void setGripLevel(String gripLevel) {
		this.gripLevel = gripLevel;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}	
	
	
}

public class Tracks {
	
	private List<Track> t = new ArrayList<Track>();
	
	Tracks(){
		
	}
	
	public void checkUpdate(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openTrackList();
		
		List<WebElement> trackList = h.getDriver().findElements(
				By.cssSelector("table.styled.borderbottom.flag tbody tr"));
		
        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/gpro?autoReconnect=true&useSSL=false";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            java.sql.Statement st = conn.createStatement();
            ResultSet queryResult = st.executeQuery("SELECT COUNT(*) FROM track");
            int totalRows = 0;
            while (queryResult.next()) {
            	totalRows += queryResult.getInt(1);
            }

            System.out.println("Current number of tracks is: " + totalRows + ".");
            
            if(totalRows < trackList.size()-1){
            	System.out.println("Track list is not updated!");
            	System.out.println("Updating...");
            	this.update(conn);
            	conn.close();
            }
            else{
            	System.out.println("Track list is up to date!");
            	conn.close();
            }
            
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
		
	}
	
	public void update(Connection dbConn){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openTrackList();
		List<WebElement> trackList = h.getDriver().findElements(
				By.cssSelector("table.styled.borderbottom.flag tbody td"));
		Track newTrack;
		
		int x = 0;
		for(int i = 0; i < ((trackList.size()+1)/10); i++){
			
			List<WebElement> trackList2 = h.getDriver().findElements(
					By.cssSelector("table.styled.borderbottom.flag tbody td"));
			
			newTrack = new Track();
			newTrack.setTrackName(trackList2.get(x).getText());
			newTrack.setLocation(trackList2.get(x+1).getText());
			newTrack.setRaceDistance(trackList2.get(x+2).getText());
			newTrack.setLaps(trackList2.get(x+3).getText());
			newTrack.setLapDistance(trackList2.get(x+4).getText());
			newTrack.setCategory(trackList2.get(x+8).getText());
			newTrack.setGPHeld(trackList2.get(x+9).getText());
			String trackURL = trackList2.get(x+0).findElement(By.cssSelector("a")).getAttribute("href");
			String[] parts = trackURL.split(Pattern.quote("."));
			
			System.out.println(parts[3]);
			
			h.getDriver().findElement(By.xpath("//a[@href='TrackDetails." + parts[3] + "']")).click();
			
			List<WebElement> trackInfo = h.getDriver().findElements(
					By.cssSelector("table.normal tbody tr td"));
			
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
			
			x+=10;
			h.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
			h.openTrackList();
			this.t.add(newTrack);
			
		}
		
		this.insertIntoDataBase(dbConn);
		
	}
	
	public void insertIntoDataBase(Connection dbConn){
		
		try {
			
			for (int i = 0; i < this.t.size(); i++) {
				String query = " insert into track (trackName, location, date, raceDistance,"
						+ " laps, lapDistance, avgSpeed, GPHeld, numOfCorners, pitTime, power, handling, acceleration, "
						+ "downforce, overtaking, suspRigidity, fuelConsumption, tyreWear, gripLevel, category)"
						+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

				PreparedStatement preparedStmt = dbConn.prepareStatement(query);
				preparedStmt.setString(1, t.get(i).getTrackName());
				preparedStmt.setString(2, t.get(i).getLocation());
				preparedStmt.setString(3, t.get(i).getDate());
				preparedStmt.setString(4, t.get(i).getRaceDistance());
				preparedStmt.setString(5, t.get(i).getLaps());
				preparedStmt.setString(6, t.get(i).getLapDistance());
				preparedStmt.setString(7, t.get(i).getAvgSpeed());
				preparedStmt.setString(8, t.get(i).getGPHeld());
				preparedStmt.setString(9, t.get(i).getNumOfCorners());
				preparedStmt.setString(10, t.get(i).getPitTime());
				preparedStmt.setString(11, t.get(i).getPower());
				preparedStmt.setString(12, t.get(i).getHandling());
				preparedStmt.setString(13, t.get(i).getAcceleration());
				preparedStmt.setString(14, t.get(i).getDownforce());
				preparedStmt.setString(15, t.get(i).getOvertaking());
				preparedStmt.setString(16, t.get(i).getSuspRigidity());
				preparedStmt.setString(17, t.get(i).getFuelConsumption());
				preparedStmt.setString(18, t.get(i).getTyreWear());
				preparedStmt.setString(19, t.get(i).getGripLevel());
				preparedStmt.setString(20, t.get(i).getCategory());

				preparedStmt.execute();
			}
			
		} catch (SQLException e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		
		System.out.println("Track list updated!");
		
	}
	
}







