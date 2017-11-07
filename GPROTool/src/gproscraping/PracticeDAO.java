package gproscraping;

import java.util.List;
import java.util.TreeMap;

public class PracticeDAO extends SerializingDAO {

        private static PracticeDAO instance;
    
	PracticeDAO(String fileName) {
		super(fileName);
	}
        
        public static PracticeDAO getInstance(){
            if (PracticeDAO.instance == null) {
                instance = new PracticeDAO("practice.txt");
                return instance;
            } else {
                return instance;
            }
        }
        
        
	public Practice readPractice(Integer id){
            
            Practice p;
            p = new Practice();
            
            TreeMap<Integer, GameObject> load = PracticeDAO.instance.load();
            
            p = (Practice) load.get(id);
            
            return p;
            
        }

}
