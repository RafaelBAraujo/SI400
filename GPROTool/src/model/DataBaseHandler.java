package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DataBaseHandler {

    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=GPRO;integratedSecurity=true";
    private static DataBaseHandler DBHandler = null;
    public Connection dbConn;

    DataBaseHandler() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.dbConn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block

        }
        // TODO Auto-generated catch block
    }

    public void insertTracks(List<Track> t) {

    }

    public static DataBaseHandler getConnection() {
        if (DBHandler == null) {
            DBHandler = new DataBaseHandler();
            return DBHandler;
        } else {
            return DBHandler;
        }
    }

    public static void closeConnection() {
        try {
            DBHandler.dbConn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
    }

}
