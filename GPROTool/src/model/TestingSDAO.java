/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.TreeMap;

/**
 *
 * @author Marcelo
 */
public class TestingSDAO extends SDAO<Testing>{
    
    public static TestingSDAO instance;
    private final String fileName = "testing.ser";
    
    private TreeMap<String, Testing> testing;
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
