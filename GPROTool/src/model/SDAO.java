/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rafael
 * @param <T>
 */
public abstract class SDAO<T> implements DAO<T, T> {
    
    //private FileOutputStream fileOut;
    private ObjectOutputStream out;
    //private FileInputStream fileIn;
    private ObjectInputStream in;
    private String fileName;
    
    public SDAO(){
        //this.out = this.getOutputStream(fileName);
        //this.in = this.getInputStream(fileName);
    }
    
    @Override
    public Object search(Object o){
        return o;
    }
    
    /*protected ObjectOutputStream getOutputStream(String fileName){
        this.fileName = fileName;
        if(out == null){
            try {
                File f = new File(fileName);
                if(!f.exists())
                    f.createNewFile();
                
                out = new ObjectOutputStream(new FileOutputStream(fileName));
                return out;
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return out;
    }*/
    
    /*protected ObjectInputStream getInputStream(String fileName){
        this.fileName = fileName;
        if(in == null){
            try {
                File f = new File(fileName);
                if(!f.exists())
                    f.createNewFile();
                
                in = new ObjectInputStream(new FileInputStream(fileName));
                return in;
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return in;
    }*/
    
    public ObjectOutputStream getOut(){
        if(this.out != null)
            return this.out;
        else{
            
            return null;
        }
    }
    
    public ObjectInputStream getIn(){
        if(this.in != null)
            return this.in;
        else{
            
            return null;
        }
    }
    
    public boolean fileIsEmpty(){
        
        File f = new File(fileName);
        return f.length() <= 0;
        
    }
    
}