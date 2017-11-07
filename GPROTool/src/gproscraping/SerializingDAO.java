package gproscraping;

import control.AppendingObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SerializingDAO implements DAO {

    FileOutputStream fileOut;
    FileInputStream fileIn;
    ObjectOutputStream out;
    ObjectInputStream in;
    String fileName;
	
	/*SerializingDAO(String fileName){
		this.fileSist = FileSystems.getDefault();
		if(Files.exists(fileSist.getPath(fileName))){
			file = fileSist.getPath(fileName);
		}
		else{
			File newFile = new File(fileName);
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				System.out.println("The system could not create a new file called " + fileName + "!");
			}
			file = fileSist.getPath(fileName);
		}
	}*/
        
        SerializingDAO(String fileName){
            this.fileName = fileName;
            File f = new File(fileName);
            try{
                if (f.exists() && !f.isDirectory()) {
                    this.fileOut = new FileOutputStream(fileName);
                    this.fileIn = new FileInputStream(fileName);
                    this.out = new AppendingObjectOutputStream(this.fileOut);
                    this.in = new ObjectInputStream(this.fileIn);
                } else {
                    f.createNewFile();
                    this.fileOut = new FileOutputStream(fileName);
                    this.fileIn = new FileInputStream(fileName);
                    this.out = new AppendingObjectOutputStream(this.fileOut);
                    this.in = new ObjectInputStream(this.fileIn);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
	
        public void open(){
            try{
                this.fileOut = new FileOutputStream(this.fileName);
                this.fileIn = new FileInputStream(this.fileName);
                this.out = new AppendingObjectOutputStream(this.fileOut);
                this.in = new ObjectInputStream(this.fileIn);
            }
            catch(Exception e){
            
            }
        }
        
	@Override
	public void save(Object o) {
            this.open();
            try {
                out.writeObject(o);
                out.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
	}
	
        /*public void retrieve(Object o) throws ClassNotFoundException {
            ObjectInputStream ois;
            try{
                ois = new ObjectInputStream(Files.newInputStream(this.file));
		o = (Object)ois.readObject(); 
                System.out.println(o);
            } catch(IOException e){
                    e.printStackTrace();
                    
            }
                        
        }*/
	public TreeMap<Integer, GameObject> load() {
		
            ArrayList<GameObject> lo = new ArrayList<>();
            GameObject o;
            TreeMap<Integer, GameObject> tmap = new TreeMap<>();
            
            ObjectInputStream ois;
            try {
                this.open();
                o = (GameObject) this.in.readObject();
                tmap.put(o.getId(), o);
                System.out.println(o);
            } catch (IOException e) {
                Logger.getLogger(SerializingDAO.class.getName()).log(Level.SEVERE, null, e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SerializingDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return tmap;
	}
	
}
