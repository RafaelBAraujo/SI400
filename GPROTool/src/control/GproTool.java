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

/**
 *
 * @author Rafael
 */
public class GproTool {
    
    public static void main(String args[]){
        
        //ConnectionHandler handler = new ConnectionHandler();
        //Scraper s = new Scraper();
        //Race r = s.readRace();
        //Car myCar = s.readCar();
        //System.out.println(myCar.getManagerName());
        
        DAO dao = CarSDAO.getInstance();
        //DAO dao = TrackSDAO.getInstance();
        /*DAO dao = RaceSDAO.getInstance();
        HashSet hs = new HashSet();
        hs.add(61);
        hs.add("Rookie");
        hs.add(59);*/
        
        HashSet hs = new HashSet();
        hs.add(61);
        hs.add("Rookie");
        hs.add(59);
        hs.add("Marcelo Farie");
        
        try {
            //dao.add(myCar);
            //dao.add(r);
            Car rNew = (Car) dao.get(hs);
            if(rNew != null)
                System.out.println(rNew.getPower());
            else{
                System.out.println("n encontrei");
            }
            /*try {
            dao.add(r);
            } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }

        //System.out.println(pdao.getLastId());
        
        GproToolController baseController = new GproToolController();
        baseController.start();
    }
    
}
