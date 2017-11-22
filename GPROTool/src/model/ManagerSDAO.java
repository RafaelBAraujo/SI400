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
 * @author Rafael
 */
public class ManagerSDAO extends SDAO<Manager> {
    
    public static ManagerSDAO instance;
    private final String fileName = "managers.ser";
    
    private TreeMap<String, Manager> managers;
    
    public ManagerSDAO(){
        this.managers = new TreeMap<>();
        this.getAll();
    }
    
    public static ManagerSDAO getInstance(){
        if(ManagerSDAO.instance == null){
            ManagerSDAO.instance = new ManagerSDAO();
        }
        return ManagerSDAO.instance;
    }

    public void getAll(){
        try{
            FileInputStream fileIn = new FileInputStream(this.fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TreeMap<String, Manager> managersFile;
            managersFile = (TreeMap<String, Manager>) in.readObject();
            fileIn.close();
            in.close();
            this.managers = managersFile;
        } catch(EOFException | FileNotFoundException | ClassNotFoundException ex){
            File f = new File(this.fileName);
            try {
                boolean createNewFile = f.createNewFile();
                if (createNewFile) {
                }
            } catch (IOException ex1) {
                Logger.getLogger(ManagerSDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagerSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Manager get(Object o) throws Exception {
        //System.out.println("Size of tree is: "+this.managers.size());
        if(o instanceof String){
            String managerName = (String) o;
            for(Map.Entry<String, Manager> entry : this.managers.entrySet()){
                if(entry.getKey().compareTo(managerName) == 0){
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public void delete(Manager b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Manager b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Manager b) throws Exception {
        if (!this.managers.isEmpty()) {
            for (Map.Entry<String, Manager> entry : this.managers.entrySet()) {
                if (entry.getKey().compareTo(b.getName()) == 0) {
                    return;
                }
            }
            this.managers.put(b.getName(), b);
            try {
                FileOutputStream fileOut = new FileOutputStream(this.fileName);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this.managers);
                fileOut.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(ManagerSDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.managers.put(b.getName(), b);
        try {
            FileOutputStream fileOut = new FileOutputStream(this.fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.managers);
            fileOut.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ManagerSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Object search(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
