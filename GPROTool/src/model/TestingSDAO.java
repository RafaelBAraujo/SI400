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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Marcelo
 */
public class TestingSDAO extends SDAO<Testing>{
    
    public static TestingSDAO instance;
    private final String fileName = "testing.ser";
    
    
    private TreeMap<Integer, Testing> testing;
    
    public TestingSDAO(){
        this.testing = new TreeMap<>();
        this.getAll();
        //this.updateIndexes();
    }
    
    public static TestingSDAO getInstance(){
        if(TestingSDAO.instance == null){
            TestingSDAO.instance = new TestingSDAO();
        }
        return TestingSDAO.instance;    
    }

            
    @Override
    public Testing get(Object o) throws Exception {
        if (!this.testing.isEmpty()) {
            if (o instanceof HashSet) {
                HashSet querySet;
                querySet = (HashSet) o;
                switch(querySet.size()){
                        
                    // seek for season
                    case 1:
                        for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                            HashSet currentTe = new HashSet();
                            currentTe.add(entry.getValue().getSeason());
                            if(currentTe.equals(querySet)){
                                System.out.println(entry.getValue());
                                return entry.getValue();
                            }
                        }
                        break;
                        
                    // seek for rank
                    case 2:
                        for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                            HashSet currentTe = new HashSet();
                            currentTe.add(entry.getValue().getSeason());
                            currentTe.add(entry.getValue().getRank());
                            if(currentTe.equals(querySet)){
                                return entry.getValue();
                            }
                        }
                        break;
                    // seek for rank division
                    case 3:
                        for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                            HashSet currentTe = new HashSet();
                            currentTe.add(entry.getValue().getSeason());
                            currentTe.add(entry.getValue().getRank());
                            currentTe.add(entry.getValue().getRankDivision());
                            if(currentTe.equals(querySet)){
                                return entry.getValue();
                            }
                        }
                        break;
                        
                    // seek for manager
                    case 4:
                        for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                            HashSet currentTe = new HashSet();
                            currentTe.add(entry.getValue().getSeason());
                            currentTe.add(entry.getValue().getRank());
                            currentTe.add(entry.getValue().getRankDivision());
                            currentTe.add(entry.getValue().getManagerUsername());
                            if(currentTe.equals(querySet)){
                                return entry.getValue();
                            }
                        }
                        break;
                        
                    case 5:
                        for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                            HashSet currentTe = new HashSet();
                            currentTe.add(entry.getValue().getSeason());
                            currentTe.add(entry.getValue().getRank());
                            currentTe.add(entry.getValue().getRankDivision());
                            currentTe.add(entry.getValue().getManagerUsername());
                            currentTe.add(entry.getValue().getStints());
                            if(currentTe.equals(querySet)){
                                return entry.getValue();
                            }
                        }
                        break;    

                    default:
                        System.out.println("Query not yet implemented.");
                }
            }
            
        }
        return null;
    }

    @Override
    public void delete(Testing b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Testing b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Testing b) throws Exception {
        HashSet addingTesting = new HashSet();
        addingTesting.add(b.getSeason());
        addingTesting.add(b.getRank());
        addingTesting.add(b.getRankDivision());
        addingTesting.add(b.getManagerUsername());
        addingTesting.add(b.getTrack());

        if(!this.testing.isEmpty()){
            for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                HashSet currentTesting = new HashSet();
                currentTesting.add(entry.getValue().getSeason());
                currentTesting.add(entry.getValue().getRank());
                currentTesting.add(entry.getValue().getRankDivision());
                currentTesting.add(entry.getValue().getManagerUsername());
                currentTesting.add(entry.getValue().getTrack());

                if(currentTesting.equals(addingTesting)){
                    return;
                }
            }
            Integer lastKey = this.testing.lastKey();
            this.testing.put(lastKey + 1, b);
            try{
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.testing);
                fileOut.close();
                out.close();
            }catch(IOException ex){
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        this.testing.put(1, b);
            try{
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.testing);
                fileOut.close();
                out.close();
            }catch(IOException ex){
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public Object search(Object o){
        try {
            TreeMap<Integer, Testing> result = this.searchTesting((TestingQuery) o);
            return result;
        } catch (Exception ex) {
            Logger.getLogger(RaceAnalysisSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private void getAll() {
        try{
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<Integer, Testing> testingFile;
            testingFile = (TreeMap<Integer, Testing>) in.readObject();
            fileIn.close();
            in.close();
            this.testing = testingFile;
        } catch(EOFException | FileNotFoundException | ClassNotFoundException ex){
            File f = new File(this.fileName);
            try{
                boolean createNewFile = f.createNewFile();
                if(createNewFile){
                    System.out.println("got here");
                }
            } catch(IOException exl) {
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, exl);
            }
        } catch(IOException ex){
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public TreeMap<Integer, Testing> searchTesting(TestingQuery query) throws Exception {
        
 
        
        TreeMap<Integer, Testing> result = new TreeMap<>();

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
        
        if(!query.getNameTrack().isEmpty()){
            TreeMap<Integer, String> trackIndex = new TreeMap<>(this.loadIndexFromFile("trackName_index.ser"));
            for(Map.Entry<Integer, String> entry : trackIndex.entrySet()){
                if(entry.getValue().compareTo(query.getNameTrack()) == 0){
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
        
        return result;
    }
    
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
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } catch (IOException ex) {
            Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public void createSeasonIndex() {

        TreeMap<Integer, Integer> seasonIndex = new TreeMap<>();

        if (!this.testing.isEmpty()) {

            for (Map.Entry<Integer, Testing> entry : this.testing.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getSeason());
            }

        }

        this.saveIndexToFile(seasonIndex, "season_index.ser");

    }
    public void createRankIndex() {

        TreeMap<Integer, String> seasonIndex = new TreeMap<>();
        if (!this.testing.isEmpty()) {

            for (Map.Entry<Integer, Testing> entry : this.testing.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRank());
            }

        }

        this.saveIndexToFile(seasonIndex, "rank_index.ser");

    }
    public void createRankDivisionIndex() {

        TreeMap<Integer, Integer> seasonIndex = new TreeMap<>();
        if (!this.testing.isEmpty()) {

            for (Map.Entry<Integer, Testing> entry : this.testing.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getRankDivision());
            }

        }

        this.saveIndexToFile(seasonIndex, "rankDiv_index.ser");

    }
    public void createNameTrackIndex() {

        TreeMap<Integer, String> seasonIndex = new TreeMap<>();
        if (!this.testing.isEmpty()) {

            for (Map.Entry<Integer, Testing> entry : this.testing.entrySet()) {
                seasonIndex.put(entry.getKey(), entry.getValue().getTrack());
            }

        }
        
        this.saveIndexToFile(seasonIndex, "trackName_index.ser");

    }
    public void createStintIndex() {

        TreeMap<Integer, TestingStint> stintIndex = new TreeMap<>();
        if (!this.testing.isEmpty()) {

            for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                for(TestingStint stint : entry.getValue().getStints()){
                    stintIndex.put(entry.getKey(), stint);
                }
            }

        }

        this.saveIndexToFile(stintIndex, "tyres_index.ser");

    }
    public void createManagerIndex(){
        
        TreeMap<Integer, String> managerIndex = new TreeMap<>();
        if (!this.testing.isEmpty()) {

            for (Map.Entry<Integer, Testing> entry : this.testing.entrySet()) {
                managerIndex.put(entry.getKey(), entry.getValue().getManagerUsername());
            }

        }

        this.saveIndexToFile(managerIndex, "manager_index.ser");
        
    }
    
        public void updateIndexes(){
     
        this.createSeasonIndex();
        this.createRankIndex();
        this.createRankDivisionIndex();
        this.createNameTrackIndex();
        this.createManagerIndex();
        this.createStintIndex();

        
    }
}
