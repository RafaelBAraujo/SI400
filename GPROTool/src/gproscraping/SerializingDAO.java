package gproscraping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SerializingDAO implements DAO {

	private final FileSystem fileSist;
	private final Path file;
	
	SerializingDAO(String fileName){
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
	}
	
	@Override
	public void save(Object o) {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(Files.newOutputStream(this.file));
			oos.writeObject(o);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
        public void retrieve(Object o) throws ClassNotFoundException {
            ObjectInputStream ois;
            try{
                ois = new ObjectInputStream(Files.newInputStream(this.file));
		o = (Object)ois.readObject(); 
                System.out.println(o);
            } catch(IOException e){
                    e.printStackTrace();
                    
            }
                        
        }
	public TreeMap<Integer, GameObject> load() {
		
            ArrayList<GameObject> lo = new ArrayList<>();
            GameObject o;
            TreeMap<Integer, GameObject> tmap = new TreeMap<>();
            
            ObjectInputStream ois;
            try {
                ois = new ObjectInputStream(Files.newInputStream(this.file));
                o = (GameObject) ois.readObject();
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
