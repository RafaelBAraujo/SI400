package gproscraping;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class PracticeDAO extends SerializingDAO {

        private static PracticeDAO instance;
    
	PracticeDAO(String fileName) throws IOException {
		super(fileName);
	}
        
        public static PracticeDAO getInstance() throws IOException{
            if (PracticeDAO.instance == null) {
                instance = new PracticeDAO("practice.ser");
                return instance;
            } else {
                return instance;
            }
        }
        
        public Integer getLastId(){
            
            Integer id = -1;
            
            TreeMap<Integer, GameObject> load = PracticeDAO.instance.load();
            
            id = load.lastKey();
            
            return id;
            
        }        
        
	public Practice readPractice(Integer id){
            
            Practice p;
            p = new Practice();
            
            TreeMap<Integer, GameObject> load = PracticeDAO.instance.load();
            
            p = (Practice) load.get(id);
            
            return p;
            
        }

}
