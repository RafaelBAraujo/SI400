/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import view.Login;

/**
 *
 * @author Rafael
 */
public class GproTool {
    
    public static void main(String args[]){
        
        ConnectionHandler handler = new ConnectionHandler();
        Scraper s = new Scraper();
        Manager m = s.readManager();
        
        DAO dao = ManagerSDAO.getInstance();
        
        try {
            dao.add(m);
            Manager readManager = (Manager) dao.get("Rafael Araújo");
            if(readManager != null){
                System.out.println(readManager.getUsername());
            }
            else{
                System.out.println("nao encontrei o marcelo");
            }
            
            //Race r = s.readRace();
            //Car myCar = s.readCar();
            //System.out.println(myCar.getManagerName());
            
            //DAO dao = CarSDAO.getInstance();
            //DAO dao = TrackSDAO.getInstance();
            /*DAO dao = RaceSDAO.getInstance();
            HashSet hs = new HashSet();
            hs.add(61);
            hs.add("Rookie");
            hs.add(59);*/
        } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
        
    }
    
}
