/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
    
    
    private TreeMap<TestingStint[], Testing> testing;
    
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
        if(o instanceof Testing){
            Testing t = (Testing) o;
            for(Map.Entry<TestingStint[], Testing> entry : this.testing.entrySet()){
                if(entry.getValue().getTestingWeather()== t.getTestingWeather()){
                    return entry.getValue();
                    
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public void delete(Testing b) {
        
    }

    @Override
    public void update(Testing b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Testing b) throws Exception {
        Testing t = (Testing) b;
        if(!this.testing.isEmpty()){
            for(Map.Entry<TestingStint[], Testing> entry : this.testing.entrySet()){
                if(entry.getValue().getTestingWeather()== t.getTestingWeather()){
                    return;
                }
            }
            //stints eh do tipo TestingStints[]
            this.testing.put(b.getStints(), t);
            try{
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.testing);
                fileOut.close();
            }catch(IOException ex){
                Logger.getLogger(TestingSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        this.testing.put(b.getStints(), t);
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
        
    }
    
    
    
}
