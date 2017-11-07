/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import gproscraping.ConnectionHandler;
import gproscraping.Practice;
import gproscraping.PracticeDAO;
import gproscraping.Scraper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class GproTool {
    
    public static void main(String args[]){
        
        ConnectionHandler handler = new ConnectionHandler();
        Scraper s = new Scraper();
        
        Practice p = new Practice();
        
        p = s.readPractice();
        
        PracticeDAO pdao;
        try {
            pdao = PracticeDAO.getInstance();
            pdao.save(p);
        } catch (IOException ex) {
            Logger.getLogger(GproTool.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //Practice x = pdao.readPractice(0);
        
        //System.out.println(x.getId());
        
        //System.out.println(pdao.getLastId());
        
        GproToolController baseController = new GproToolController();
        baseController.start();
    }
    
}
