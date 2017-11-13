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
import java.util.ArrayList;
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

    public RaceAnalysisSDAO() {
        this.raceAnalysiss = new TreeMap<>();
        this.getAll();
        System.out.println("starting...");
        this.updateIndexes();
        System.out.println("ENDED...");
    }

    public static RaceAnalysisSDAO getInstance() {
        if (RaceAnalysisSDAO.instance == null) {
            RaceAnalysisSDAO.instance = new RaceAnalysisSDAO();
        }

        return RaceAnalysisSDAO.instance;
    }

    public void getAll() {
        try {
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, RaceAnalysis> analyssFile;
            analyssFile = (TreeMap<Integer, RaceAnalysis>) in.readObject();
            fileIn.close();
            in.close();
            this.raceAnalysiss = analyssFile;
        } catch (EOFException | FileNotFoundException | ClassNotFoundException ex) {
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

    public TreeMap<Integer, RaceAnalysis> searchRaces(RaceQuery query) throws Exception {

        TreeMap<Integer, RaceAnalysis> result = new TreeMap<>();

        if(query.getSeason() != null){
            TreeMap<Integer, Integer> seasonIndex = new TreeMap<>(this.loadIndexFromFile("season_index.ser"));
            for(Map.Entry<Integer, Integer> entry : seasonIndex.entrySet()){
                if(entry.getValue().compareTo(query.getSeason()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(query.getRank() != null){
            TreeMap<Integer, String> rankIndex = new TreeMap<>(this.loadIndexFromFile("rank_index.ser"));
            for(Map.Entry<Integer, String> entry : rankIndex.entrySet()){
                if(entry.getValue().compareTo(query.getRank()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(query.getRankDivision() != null){
            TreeMap<Integer, Integer> rankDivisionIndex = new TreeMap<>(this.loadIndexFromFile("rankDiv_index.ser"));
            for(Map.Entry<Integer, Integer> entry : rankDivisionIndex.entrySet()){
                if(entry.getValue().compareTo(query.getRankDivision()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(query.getRaceNumber() != null){
            TreeMap<Integer, Integer> raceNumberIndex = new TreeMap<>(this.loadIndexFromFile("raceNumber_index.ser"));
            for(Map.Entry<Integer, Integer> entry : raceNumberIndex.entrySet()){
                if(entry.getValue().compareTo(query.getRaceNumber()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(!query.getTrack().isEmpty()){
            TreeMap<Integer, String> trackIndex = new TreeMap<>(this.loadIndexFromFile("trackName_index.ser"));
            for(Map.Entry<Integer, String> entry : trackIndex.entrySet()){
                if(entry.getValue().compareTo(query.getTrack()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(!query.getTyres().isEmpty()){
            TreeMap<Integer, String> tyresIndex = new TreeMap<>(this.loadIndexFromFile("tyres_index.ser"));
            for(Map.Entry<Integer, String> entry : tyresIndex.entrySet()){
                if(entry.getValue().compareTo(query.getTyres()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(!query.getManagerUsername().isEmpty()){
            TreeMap<Integer, String> managerIndex = new TreeMap<>(this.loadIndexFromFile("manager_index.ser"));
            for(Map.Entry<Integer, String> entry : managerIndex.entrySet()){
                if(entry.getValue().compareTo(query.getManagerUsername()) == 0){
                    result.put(entry.getKey(), this.get(entry.getKey()));
                }
            }
        }
        
        if(query.getPilot() != null){
            if(!query.getPilot().getName().isEmpty()){
                TreeMap<Integer, String> pilotIndex = new TreeMap<>(this.loadIndexFromFile("manager_index.ser"));
                for(Map.Entry<Integer, String> entry : pilotIndex.entrySet()){
                    if(entry.getValue().compareTo(query.getPilot().getName()) == 0){
                        result.put(entry.getKey(), this.get(entry.getKey()));
                    }
                }
            }
        }
        return result;
    }

    /*public RaceAnalysis get(HashSet query) throws Exception {

        return null;
    }*/
    
    public void saveIndexToFile(Map index, String fileName) {

        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(index);
            fileOut.close();
            out.close();
        } catch (FileNotFoundException ex) {
            File f = new File(fileName);
            try {
                f.createNewFile();
                fileOut = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(index);
                fileOut.close();
                out.close();
            } catch (IOException ex1) {
                Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } catch (IOException ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Map loadIndexFromFile(String fileName) {

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Map m = (Map) in.readObject();
            fileIn.close();
            in.close();
            return m;
        } catch (IOException ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    
    public void createSeasonIndex() {

        TreeMap<Integer, Integer> seasonIndex = new TreeMap<>();

        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRace().getSeason());
            }

        }

        this.saveIndexToFile(seasonIndex, "season_index.ser");

    }

    public void createRankIndex() {

        TreeMap<Integer, String> seasonIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRace().getRank());
            }

        }

        this.saveIndexToFile(seasonIndex, "rank_index.ser");

    }

    public void createRankDivisionIndex() {

        TreeMap<Integer, Integer> seasonIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRace().getRankDivision());
            }

        }

        this.saveIndexToFile(seasonIndex, "rankDiv_index.ser");

    }

    public void createRaceNumberIndex() {

        TreeMap<Integer, Integer> seasonIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRace().getRaceNumber());
            }

        }

        this.saveIndexToFile(seasonIndex, "raceNumber_index.ser");

    }

    public void createTrackIndex() {

        TreeMap<Integer, String> seasonIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRace().getTrack().getTrackName());
            }

        }
        
        this.saveIndexToFile(seasonIndex, "trackName_index.ser");

    }

    public void createTyresIndex() {

        TreeMap<Integer, String> tyresIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                tyresIndex.put(entry.getKey(), entry.getValue().getStrategy().getRaceSetup().getTyres());
            }

        }

        this.saveIndexToFile(tyresIndex, "tyres_index.ser");

    }
    
    public void createManagerIndex(){
        
        TreeMap<Integer, String> managerIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                managerIndex.put(entry.getKey(), entry.getValue().getRace().getManagerUsername());
            }

        }

        this.saveIndexToFile(managerIndex, "manager_index.ser");
        
    }
    
    public void createPilotIndex(){
        
        TreeMap<Integer, String> pilotIndex = new TreeMap<>();
        if (!this.raceAnalysiss.isEmpty()) {

            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                pilotIndex.put(entry.getKey(), entry.getValue().getPilot().getName());
            }

        }

        this.saveIndexToFile(pilotIndex, "pilot_index.ser");
        
    }
    
    public void updateIndexes(){
     
        this.createSeasonIndex();
        this.createRankIndex();
        this.createRankDivisionIndex();
        this.createRaceNumberIndex();
        this.createTrackIndex();
        this.createManagerIndex();
        this.createTyresIndex();
        this.createPilotIndex();
        
    }
    
    @Override
    public RaceAnalysis get(Object o) throws Exception {
        if (!this.raceAnalysiss.isEmpty()) {
            if (o instanceof RaceQuery) {
                this.searchRaces((RaceQuery) o);
            }
            if (o instanceof Integer) {
                return this.raceAnalysiss.get((Integer) o); 
            }
            else if (o instanceof HashSet) {
                HashSet querySet;
                querySet = (HashSet) o;
                switch (querySet.size()) {

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

    public RaceAnalysis seekValue() {
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
        if (!this.raceAnalysiss.isEmpty()) {
            for (Map.Entry<Integer, RaceAnalysis> entry : this.raceAnalysiss.entrySet()) {
                HashSet currentRace = new HashSet();
                currentRace.add(entry.getValue().getRace().getSeason());
                currentRace.add(entry.getValue().getRace().getRank());
                currentRace.add(entry.getValue().getRace().getRankDivision());
                currentRace.add(entry.getValue().getRace().getRaceNumber());
                currentRace.add(entry.getValue().getRace().getManagerUsername());
                if (currentRace.equals(addingRaceAnalysis)) {
                    return;
                }
            }
            Integer lastKey = this.raceAnalysiss.lastKey();
            this.raceAnalysiss.put(lastKey + 1, b);
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

    @Override
    public Object search(Object o) {
        try {
            TreeMap<Integer, RaceAnalysis> result = this.searchRaces((RaceQuery) o);
            return result;
        } catch (Exception ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
