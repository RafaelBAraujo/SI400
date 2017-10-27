/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproscraping;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
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
    
    /*public void savePilot(Pilot phill){ 
    
        phill = src.readPilot();

    }*/
    
    public void printBar(int num){
    
        for(int i = 0; i < (num / 9.61538); i++){
        
            System.out.printf("|");
            
        }
        
    }
    
    public void retrievePilot(Pilot phill){
        
       try {
            phill = src.readPilot();
            System.out.println("Overall:");
            ser.save(phill.getOa());
            ser.retrieve(phill.getOa());
            printBar(phill.getOa());
            
            System.out.println("\nConcentration:");
            ser.save(phill.getCon());
            ser.retrieve(phill.getCon());
            printBar(phill.getCon());
            
            System.out.println("\nTalent:");
            ser.save(phill.getTal());
            ser.retrieve(phill.getTal());
            printBar(phill.getTal());
            
            System.out.println("\nAgressiveness:");
            ser.save(phill.getAgr());
            ser.retrieve(phill.getAgr());
            printBar(phill.getAgr());
            
            System.out.println("\nExperiencia:");
            ser.save(phill.getExp());
            ser.retrieve(phill.getExp());
            printBar(phill.getExp());
            
            System.out.println("\nTechnical insight:");
            ser.save(phill.getTeI());
            ser.retrieve(phill.getTeI());
            printBar(phill.getTeI());
            
            System.out.println("\nStamina:");
            ser.save(phill.getSta());
            ser.retrieve(phill.getSta());
            printBar(phill.getSta());
            
            System.out.println("\nCharisma:");
            ser.save(phill.getCha());
            ser.retrieve(phill.getCha());
            printBar(phill.getCha());
            
            System.out.println("\nMotivation:");
            ser.save(phill.getMot());
            ser.retrieve(phill.getMot());
            printBar(phill.getMot());
            
            System.out.println("\nReputation:");
            ser.save(phill.getRep());
            ser.retrieve(phill.getRep());
            printBar(phill.getRep());
            
            System.out.println("\nWeight(Kg):");
            ser.save(phill.getWeight());
            ser.retrieve(phill.getWeight());
            printBar(phill.getWeight());

            System.out.println("\n...\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PilotDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
