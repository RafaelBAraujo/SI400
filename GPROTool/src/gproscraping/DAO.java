package gproscraping;

import java.util.TreeMap;

public interface DAO<T> {

	public void save(Object o);
	public TreeMap<Integer, T> load();
	
}
