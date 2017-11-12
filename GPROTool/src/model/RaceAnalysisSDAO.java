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
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class RaceAnalysisSDAO extends SDAO<RaceAnalysis> {
    
    private static RaceAnalysisSDAO instance;
    private String fileName = "race_analysiss.ser";
    
    private TreeMap<Integer, RaceAnalysis> raceAnalysiss;
    
    public RaceAnalysisSDAO(){
        this.raceAnalysiss = new TreeMap<>();
        this.getAll();
    }
    
    public static RaceAnalysisSDAO getInstance(){
        if(RaceAnalysisSDAO.instance == null){
            RaceAnalysisSDAO.instance = new RaceAnalysisSDAO();
        }
        
        return RaceAnalysisSDAO.instance;
    }

    public void getAll(){
        try{
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, RaceAnalysis> analyssFile;
            analyssFile = (TreeMap<Integer, RaceAnalysis>) in.readObject();
            fileIn.close();
            in.close();
            this.raceAnalysiss = analyssFile;
        } catch(EOFException | FileNotFoundException | ClassNotFoundException ex){
            File f = new File(this.fileName);
            try {
                boolean createNewFile = f.createNewFile();
                if (createNewFile) {
                }
            } catch (IOException ex1) {
                Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public RaceAnalysis get(Object o) throws Exception {
        if(!this.raceAnalysiss.isEmpty()){
            if(o instanceof HashSet){
                HashSet querySet;
                querySet = (HashSet) o;
                switch(querySet.size()){
                    
                    // seek for /* season */
                    case 1:
                        for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                            HashSet currentRa = new HashSet();
                            currentRa.add(entry.getValue().getRace().getSeason());
                            if (currentRa.equals(querySet)) {
                                return entry.getValue();
                            }
                        }
                        break;
                        
                    // seek for /* ^ | rank */
                    case 2:
                        for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                            HashSet currentRa = new HashSet();
                            currentRa.add(entry.getValue().getRace().getSeason());
                            currentRa.add(entry.getValue().getRace().getRank());
                            if (currentRa.equals(querySet)) {
                                return entry.getValue();
                            }
                        }
                        break;
                    
                    // seek for /* ^ | rankDivision */
                    case 3:
                        for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                            HashSet currentRa = new HashSet();
                            currentRa.add(entry.getValue().getRace().getSeason());
                            currentRa.add(entry.getValue().getRace().getRank());
                            currentRa.add(entry.getValue().getRace().getRankDivision());
                            if (currentRa.equals(querySet)) {
                                return entry.getValue();
                            }
                        }
                        break;
                    
                    // seek for /* ^ | raceNumber | manager */
                    case 5:
                        for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                            HashSet currentRa = new HashSet();
                            currentRa.add(entry.getValue().getRace().getSeason());
                            currentRa.add(entry.getValue().getRace().getRank());
                            currentRa.add(entry.getValue().getRace().getRankDivision());
                            currentRa.add(entry.getValue().getRace().getRaceNumber());
                            currentRa.add(entry.getValue().getRace().getManagerUsername());
                            if (currentRa.equals(querySet)) {
                                return entry.getValue();
                            }
                        }
                        break;
                    //seek for /* ^ | weatherDesc | temp | hum */
                    case 8:
                        for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                            HashSet currentRa = new HashSet();
                            currentRa.add(entry.getValue().getRace().getSeason());
                            currentRa.add(entry.getValue().getRace().getRank());
                            currentRa.add(entry.getValue().getRace().getRankDivision());
                            currentRa.add(entry.getValue().getRace().getRaceNumber());
                            currentRa.add(entry.getValue().getRace().getManagerUsername());
                            currentRa.add(entry.getValue().getRace().getRaceForecast().getWeather().getDescription());
                            currentRa.add(entry.getValue().getRace().getRaceForecast().getWeather().getTemperature());
                            currentRa.add(entry.getValue().getRace().getRaceForecast().getWeather().getHumidity());
                            if (currentRa.equals(querySet)) {
                                return entry.getValue();
                            }
                        }
                        break;
                    default:
                        System.out.println("Query not yet implemented.");
                        break;
                }
            }
        }
        return null;
    }
    
    public RaceAnalysis seekValue(){
        return null;
    }

    @Override
    public void delete(RaceAnalysis b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(RaceAnalysis b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(RaceAnalysis b) throws Exception {
        HashSet addingRaceAnalysis = new HashSet();
        addingRaceAnalysis.add(b.getRace().getSeason());
        addingRaceAnalysis.add(b.getRace().getRank());
        addingRaceAnalysis.add(b.getRace().getRankDivision());
        addingRaceAnalysis.add(b.getRace().getRaceNumber());
        addingRaceAnalysis.add(b.getRace().getManagerUsername());
        if(!this.raceAnalysiss.isEmpty()){
            for(Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()){
                if(entry.getKey().equals(addingRaceAnalysis)){
                    return;
                }
            }
            Integer lastKey = this.raceAnalysiss.lastKey();
            this.raceAnalysiss.put(lastKey+1, b);
            try{
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.raceAnalysiss);
                fileOut.close();
                out.close();
            }
            catch(IOException ex){
                Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        this.raceAnalysiss.put(1, b);
        try {
            FileOutputStream fileOut = new FileOutputStream(this.fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.raceAnalysiss);
            fileOut.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
