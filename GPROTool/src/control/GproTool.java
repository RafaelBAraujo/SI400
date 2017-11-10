/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.ConnectionHandler;
import model.DAO;
import model.Pilot;
import model.PilotSDAO;
import model.TrackSDAO;
import model.Scraper;
import model.Track;

/**
 *
 * @author Rafael
 */
public class GproTool {
    
    public static void main(String args[]){
        
        ConnectionHandler handler = new ConnectionHandler();
        Scraper s = new Scraper();
        
        s.readManager();

        /*Pilot p = s.readPilot();
        DAO dao = PilotSDAO.getInstance();
        try {
            Pilot p2 = (Pilot) dao.get(p);
            System.out.println(p2.getEndEnergy());
            
            //DAO dao = TrackSDAO.getInstance();
        } catch (Exception ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
        
        //System.out.println(pdao.getLastId());
        
        GproToolController baseController = new GproToolController();
        baseController.start();
    }
    
}
