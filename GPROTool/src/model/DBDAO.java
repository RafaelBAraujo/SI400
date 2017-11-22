/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 * @param <T>
 */
public abstract class DBDAO<T> implements DAO<T, T> {
    
    private static Connection conn;
    private static final String DBURL = "jdbc:mysql://localhost:3306/codecookers";
    private static final String username = "root";
    private static final String password = "1111";
    
    protected Connection getConnection(){
        if(conn == null){
            try{
                conn = DriverManager.getConnection(DBURL, username, password);
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
        return conn;
    }

    
    /*@Override
    public ResultSet get(T t) throws SQLException{
        ResultSet rs = null;
       //rs = s.executeQuery();
        return rs;
    }*/
    
    
    protected void terminar() {
        try {
            (this.getConnection()).close();
        } catch (SQLException e) {
        }
    }
    
}
