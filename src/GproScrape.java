package gproscraping;

import java.io.IOException;

public class GproScrape {

    public static void main(String[] args) throws IOException {

        ConnectionHandler handler = new ConnectionHandler();
        Scraper scraper = new Scraper();
        Practice p = new Practice();
        p.readPractice();
        //p.printLaps(p.getNumLaps());

        //scraper.readPractice();
        //scraper.readCarWear();
        //scraper.readQualifying();
        scraper.readWeather();
        //scraper.readPilot();
        //scraper.readCar();
        //scraper.readPit();
        //scraper.readRace();
//        try {
//            String myDriver = "org.gjt.mm.mysql.Driver";
//            String myUrl = "jdbc:mysql://localhost:3306/test";
//            Class.forName(myDriver);
//            Connection conn = DriverManager.getConnection(myUrl, "", "");
//
//            //Statement st = conn.createStatement();
//
//            for (int i = 0; i < p.getNumLaps(); i++) {
//                /*String query = "INSERT INTO practice (lapNum, lapTime, driverMistake, netTime, FWing, RWing, eng, brakes, gear, susp, tyres)"
//                        + " VALUES (" + i + ", \"" + p.getLap(i).getLapTime() + "\", \""
//                        + p.getLap(i).getDriverMistake() + "\", \"" + p.getLap(i).getNetTime() + "\","
//                        + p.getLap(i).getfWing() + "," + p.getLap(i).getrWing() + ","
//                        + p.getLap(i).getEngine() + "," + p.getLap(i).getBrakes() + "," + p.getLap(i).getGear() + ","
//                        + p.getLap(i).getSusp() + ", \"" + p.getLap(i).getTyres() + "\")"; */
//
//                String query = " insert into practice (lapNum, lapTime, driverMistake, netTime, FWing, RWing, eng, brakes, gear, susp, tyres)"
//                        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//                PreparedStatement preparedStmt = conn.prepareStatement(query);
//                preparedStmt.setInt(1, i);
//                preparedStmt.setString(2, p.getLap(i).getLapTime());
//                preparedStmt.setString(3, p.getLap(i).getDriverMistake());
//                preparedStmt.setString(4, p.getLap(i).getNetTime());
//                preparedStmt.setInt(5, Integer.parseInt(p.getLap(i).getfWing()));
//                preparedStmt.setInt(6, Integer.parseInt(p.getLap(i).getrWing()));
//                preparedStmt.setInt(7, Integer.parseInt(p.getLap(i).getEngine()));
//                preparedStmt.setInt(8, Integer.parseInt(p.getLap(i).getBrakes()));
//                preparedStmt.setInt(9, Integer.parseInt(p.getLap(i).getGear()));
//                preparedStmt.setInt(10, Integer.parseInt(p.getLap(i).getSusp()));
//                preparedStmt.setString(11, p.getLap(i).getTyres());
//                
//                preparedStmt.execute();
//                //st.executeUpdate(query);
//            }
//
//            conn.close();
//
//        } catch (Exception e) {
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }
        
        //Tracks t = new Tracks();
        //t.checkUpdate();       

        handler.getDriver().quit();

    }

}
