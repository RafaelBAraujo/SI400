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
import model.TrackSDAO;
import model.Scraper;
import model.Track;

/**
 *
 * @author Rafael
 */
public class GproTool {
    
    public static void main(String args[]){
        
        //ConnectionHandler handler = new ConnectionHandler();
        //Scraper s = new Scraper();

        DAO dao = TrackSDAO.getInstance();
 
        
        //System.out.println(pdao.getLastId());
        
        GproToolController baseController = new GproToolController();
        baseController.start();
    }
    
}
