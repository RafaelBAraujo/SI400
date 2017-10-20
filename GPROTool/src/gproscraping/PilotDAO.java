/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproscraping;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class PilotDAO extends SerializingDAO{
    
    public PilotDAO(String fileName) {
        super(fileName);
    }
    Scraper src = new Scraper();
    SerializingDAO ser = new SerializingDAO("pilot.ser") {};
    
    /*public void createPilot(Pilot phill){ 
    
        phill = src.readPilot();
    }*/
    
    public void retrievePilot(Pilot phill){
        
       try {
            phill = src.readPilot();
            System.out.println("Agressividade:");
            ser.save(phill.getAgr());
            ser.retrieve(phill.getAgr());
            System.out.println("Concentracao:");
            ser.save(phill.getCon());
            ser.retrieve(phill.getCon());
            System.out.println("Motivacao:");
            ser.save(phill.getMot());
            ser.retrieve(phill.getMot());
            System.out.println("Experiencia:");
            ser.save(phill.getExp());
            ser.retrieve(phill.getExp());
            System.out.println("...\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PilotDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
