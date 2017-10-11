package gproscraping;

import java.util.ArrayList;
import java.util.List;

class Pit{
	
	public String pitLap;
	public String pitReason;
	public String tyresCond;
	public String fuelLeft;
	public String refill;
	public String pitTime;
	
	public void printPit(){
		System.out.println(pitLap);
		System.out.println(pitReason);
		System.out.println(tyresCond);
		System.out.println(fuelLeft);
		System.out.println(refill);
		System.out.println(pitTime);
	}
	
}

public class PitStop {

	private List<Pit> p;
	
	PitStop(){
		p = new ArrayList<Pit>();
	}

	public List<Pit> getP() {
		return p;
	}

	public void setP(List<Pit> p) {
		this.p = p;
	}
	
	public void printAllPits(){
		
		for(int i = 0; i < p.size(); i++){
			p.get(i).printPit();
		}
		
	}
	
}
