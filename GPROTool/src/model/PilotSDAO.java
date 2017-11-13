/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class PilotSDAO extends SDAO {
    
    public static PilotSDAO instance;
    private final String fileName = "pilot.ser";
    
    TreeMap<Integer, Pilot> pilots;
    
    public PilotSDAO(){
        this.pilots = new TreeMap<>();
        this.getAll();
        System.out.println("Done!");
    }
    
    public static PilotSDAO getInstance(){
        if(PilotSDAO.instance == null){
            PilotSDAO.instance = new PilotSDAO();
        }
        return PilotSDAO.instance;
    }

    //@Override
    public void getAll(){
        try{
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, Pilot> pilotsFile;
            pilotsFile = (TreeMap<Integer, Pilot>) in.readObject();
            this.pilots = pilotsFile;
            fileIn.close();
            in.close();
            //this.checkIfUpdated();
        } catch(EOFException ex){
            Logger.getLogger(PilotSDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            File f = new File(this.fileName);
            try {
                boolean createNewFile = f.createNewFile();
                if (createNewFile) {
                    System.out.println("got here...");
                    //this.checkIfUpdated();
                }
            } catch (IOException ex1) {
                Logger.getLogger(PilotSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(PilotSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object get(Object id) throws Exception {
        if (id instanceof Pilot) {
            System.out.println("entrei");
            Pilot p = (Pilot) id;
            for (Map.Entry<Integer, Pilot> entry : this.pilots.entrySet()) {
                if (entry.getValue().getName().compareTo(p.getName()) == 0) {
                   
                    return entry.getValue();
                }
            }
            return null;
        }
        return null;
    }
    
    @Override
    public void delete(Object b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Object b) throws Exception {
        Pilot p = (Pilot) b;
        if(!this.pilots.isEmpty()){
            for (Map.Entry<Integer, Pilot> entry : this.pilots.entrySet()) {
                if(entry.getValue().getName().compareTo(p.getName()) == 0){
                    return;
                }
                
            }
            Integer lastKey = this.pilots.lastKey();
            this.pilots.put(lastKey + 1, p);
            try{
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.pilots);
                fileOut.close();
                out.close();
            }catch(IOException ex){
                Logger.getLogger(PilotSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            this.pilots.put(1, p);
            try{
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.pilots);
                fileOut.close();
                out.close();
            }catch(IOException ex){
                Logger.getLogger(PilotSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /*private void checkIfUpdated() {
         if(this.numPilot == 0){
            System.out.println("Reading Pilot...");
            Scraper s = new Scraper();
            Pilots updatedPilots = s.readPilot();
            this.pilots = new TreeMap<>();
            Integer id = 0;
            for(Pilot p : updatedPilots.getPilots()){
                pilots.put(id, p);
                id++;
            }
            this.updateList();
        }
    }*/
    
    private void updateList(){
        System.out.println("Updating file...");
        try {
            try (FileOutputStream fileOut = new FileOutputStream(this.fileName); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(this.pilots);
            }
        } catch (IOException ex) {
            Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
