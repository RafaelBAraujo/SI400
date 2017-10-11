package gproscraping;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cerealizador {
    
    private FileOutputStream fout;
    private FileInputStream fin;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    
    Cerealizador(String filepath) {
        try{
            fout = new FileOutputStream(filepath);
            fin = new FileInputStream(filepath);
            out = new ObjectOutputStream(fout);
            in = new ObjectInputStream(fin);
        }
        catch(IOException e){
            System.err.println(e);
        }
        
    }
    
    void writeObject(Object obj){
        try{
            out.writeObject(obj);
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
    
    Object readObject(){
        try{
            return in.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            System.err.println(e);
        }
        return null;
    }
}
