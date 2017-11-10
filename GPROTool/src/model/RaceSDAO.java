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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class RaceSDAO extends SDAO<Race>{

    public static RaceSDAO instance;
    private final String fileName = "races.ser";
    TreeMap<Integer, Race> races;    
    
    public RaceSDAO(){
        this.races = new TreeMap<>();
        this.getAll();
    }
    
    public static RaceSDAO getInstance(){
        if(RaceSDAO.instance == null){
            RaceSDAO.instance = new RaceSDAO();
        }
        
        return RaceSDAO.instance;
    }
    
    private void getAll(){
        try{
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, Race> raceFile;
            raceFile = (TreeMap<Integer, Race>) in.readObject();
            fileIn.close();
            in.close();
            this.races = raceFile;
        } catch(EOFException | FileNotFoundException | ClassNotFoundException ex){
            File f = new File(this.fileName);
            try {
                boolean createNewFile = f.createNewFile();
                if (createNewFile) {
                    System.out.println("got here...");
                }
            } catch (IOException ex1) {
                Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Race get(Object o) throws Exception {
        System.out.println("THE SIZE OF THIS CRAP: " + this.races.size());
        if(o instanceof HashSet){
            for (Map.Entry<Integer, Race> entry : this.races.entrySet()) {
                HashSet currentRace = new HashSet();
                currentRace.add(entry.getValue().getSeason());
                currentRace.add(entry.getValue().getRank());
                currentRace.add(entry.getValue().getRankDivision());
                HashSet querySet = new HashSet();
                querySet = (HashSet) o;
                if (currentRace.equals(querySet)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public void delete(Race b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Race b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Race b) throws Exception {
        HashSet s = new HashSet();
        s.add(b.getSeason());
        s.add(b.getRank());
        s.add(b.getRankDivision());
        //s.add(b.getTrack().getTrackName());
        if(!this.races.isEmpty()){
            for (Map.Entry<Integer, Race> entry : this.races.entrySet()) {
                if (entry.getKey().equals(s)) {
                    return;
                }
            }
            Integer key = this.races.lastKey();
            this.races.put(key + 1, b);

            try {
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.races);
            } catch (IOException ex) {
                Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            this.races.put(1, b);
            try {
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.races);
            } catch (IOException ex) {
                Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
