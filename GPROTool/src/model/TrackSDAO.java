/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.LoginException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class TrackSDAO extends SDAO<Track> {
    
    public static TrackSDAO instance;
    private final String fileName = "tracks.ser";
    private Integer numTracks;
    
    private TreeMap<Integer, Track> tracks;
    
    public TrackSDAO(){
        this.tracks = new TreeMap<>();
        this.numTracks = 0;
        this.getAll();
        //System.out.println("Done!");
    }
    
    public static TrackSDAO getInstance(){
        if(TrackSDAO.instance == null){
            TrackSDAO.instance = new TrackSDAO();
        }
        return TrackSDAO.instance;
    }

    public void getAll() {
        try{
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, Track> tracksFile;
            tracksFile = (TreeMap<Integer, Track>) in.readObject();
            this.tracks = tracksFile;
            this.numTracks = tracks.size();
            this.checkIfUpdated();
        } catch (EOFException | FileNotFoundException | ClassNotFoundException ex) {
            File f = new File(this.fileName);
            try {
                boolean createNewFile = f.createNewFile();
                if (createNewFile) {
                    //System.out.println("got here...");
                    this.checkIfUpdated();
                }
            } catch (IOException ex1) {
                Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
    private void checkIfUpdated(){
        try {
            if(this.numTracks.compareTo(Scraper.readTrackListSize(ConnectionHandler.getHandler())) != 0){
                System.out.println("Reading tracks...");
                Scraper s = new Scraper();
                Tracks updatedTracks = s.readTracks(ConnectionHandler.getHandler());
                this.tracks = new TreeMap<>();
                Integer id = 0;
                for(Track t : updatedTracks.getTracks()){
                    tracks.put(id, t);
                    id++;
                }
                this.updateList();
            }
        } catch (LoginException ex) {
            Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateList(){
        System.out.println("Updating file...");
        try {
            try (FileOutputStream fileOut = new FileOutputStream(this.fileName); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(this.tracks);
            }
        } catch (IOException ex) {
            Logger.getLogger(TrackSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Track get(Object id) throws Exception {
        if (id instanceof String) {
            for (Map.Entry<Integer, Track> entry : this.tracks.entrySet()) {
                if (entry.getValue().getTrackName().compareTo((String) id) == 0) {
                    return entry.getValue();
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public void delete(Track b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Track b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Track b) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
