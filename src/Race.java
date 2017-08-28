package gproscraping;

import java.util.ArrayList;
import java.util.List;

class Lap{
	
	public String lapNumber;
	public String lapTime;
	public String pos;
	public String tyre;
	public String weather;
	public String temp;
	public String Hum;
	public String Events;
	
	public void printLap(){
		System.out.println(lapNumber);
		System.out.println(lapTime);
		System.out.println(pos);
		System.out.println(tyre);
		System.out.println(weather);
		System.out.println(temp);
		System.out.println(Hum);
		System.out.println(Events);
	}
	
}

public class Race {

	private List<Lap> laps;
	private String moneyEarned;

	Race(){
		laps = new ArrayList<Lap>();
	}

	public List<Lap> getLaps() {
		return laps;
	}

	public void setLap(List<Lap> l) {
		this.laps = l;
	}
	
	public void printAllLaps(){
		
		for(int i = 0; i < laps.size(); i++){
			laps.get(i).printLap();
		}
		
	}

	public String getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneyEarned(String moneyEarned) {
		this.moneyEarned = moneyEarned;
	}
	
	
	
}
