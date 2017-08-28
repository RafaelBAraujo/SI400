package gproscraping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class DataBaseHandler {

	private static final String myDriver = "org.gjt.mm.mysql.Driver";
	private static final String myUrl = "jdbc:mysql://localhost:3306/gpro?autoReconnect=true&useSSL=false";
	private static Connection dbConn;
	
	public static Connection getDbConn() {
		return dbConn;
	}

	public static void setDbConn(Connection dbConn) {
		DataBaseHandler.dbConn = dbConn;
	}

	private static final String dbUser = "root";
	private static final String dbPassw = "";
	
	public DataBaseHandler(){
		try{
			Class.forName(myDriver);
			DataBaseHandler.dbConn = DriverManager.getConnection(DataBaseHandler.myUrl,
					DataBaseHandler.dbUser, DataBaseHandler.dbPassw);
		}
		catch(Exception e){
			System.err.println("Impossible to connect to database!");
            System.err.println(e.getMessage());
		}
	}
	
	public void insertTracks(List<Track> t){
		
		String query = " insert into track (trackName, location, date, raceDistance,"
				+ " laps, lapDistance, avgSpeed, GPHeld, numOfCorners, pitTime, power, handling, acceleration, "
				+ "downforce, overtaking, suspRigidity, fuelConsumption, tyreWear, gripLevel, category)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		for(int i = 0; i < t.size(); i++){
		
			try{
				PreparedStatement preparedStmt = DataBaseHandler.getDbConn().prepareStatement(query);
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
			catch(Exception e){
				System.err.println("Could not insert tracks!");
	            System.err.println(e.getMessage());
			}
		}
	}

}
