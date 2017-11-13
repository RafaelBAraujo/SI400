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
 * @author Marcelo
 */
public class TestingSDAO extends SDAO<Testing>{
    
    public static TestingSDAO instance;
    private final String fileName = "testing.ser";
    
    
    private TreeMap<Integer, Testing> testing;
    
    public TestingSDAO(){
        this.testing = new TreeMap<>();
        this.getAll();
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
                    case 5:
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
        addingTesting.add(b.getStints());
        addingTesting.add(b.getTestingDescription().getDescription());
        addingTesting.add(b.getTestingWeather().getWeather());
        
        if(!this.testing.isEmpty()){
            for(Map.Entry<Integer, Testing> entry : this.testing.entrySet()){
                if(entry.getKey().equals(addingTesting)){
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
            }catch(IOException ex){
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
    
    
}
