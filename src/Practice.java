package gproscraping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice {

	private PracticeLap[] l = new PracticeLap[8];
	private int numLaps;
	
	Practice(){
		
		numLaps = 0;
		
		for(int j = 0; j < 8; j++){
			l[j] = null;
		}
		
	}
	
	public int getNumLaps() {
		return numLaps;
	}

	public void setNumLaps(int numLaps) {
		this.numLaps = numLaps;
	}

	public PracticeLap getLap(int n){
		
		if(l[n] != null)
			return l[n];
		
		else
			System.out.println("nope");
		
		return null;
		
	}
	
	public int setLap(PracticeLap lap, int lapNumber){
		
		l[lapNumber] = lap;
		
		return 1;
		
	}
	
	public void printLaps(int numLaps){
		
		for(int j = 0; j < numLaps; j++){
			
			System.out.println(l[j].getLapTime());
			System.out.println(l[j].getDriverMistake());
			System.out.println(l[j].getNetTime());
			System.out.println(l[j].getfWing());
			System.out.println(l[j].getrWing());
			System.out.println(l[j].getEngine());
			System.out.println(l[j].getBrakes());
			System.out.println(l[j].getGear());
			System.out.println(l[j].getSusp());
			System.out.println(l[j].getTyres());
			
		}
		
	}
	
	public void readPractice(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();

		h.getDriver().findElement(By.xpath("//a[@href='RaceAnalysis.asp']")).click();
		List<WebElement> training = h.getDriver().findElements(By.cssSelector("tr.pointerhand td"));
		
		int x = 0;
        int numLaps = 0;
		
        for (int j = 0; j < 8; j++) {
        	
        	PracticeLap l = new PracticeLap();

        	if((x+1) > training.size())
        		break;
        	
        	numLaps++;
        	
        	l.setLapTime(training.get(x+1).getText());
        	l.setDriverMistake(training.get(x+2).getText());
        	l.setNetTime(training.get(x+3).getText());
        	l.setfWing(training.get(x+4).getText());
        	l.setrWing(training.get(x+5).getText());
        	l.setEngine(training.get(x+6).getText());
        	l.setBrakes(training.get(x+7).getText());
        	l.setGear(training.get(x+8).getText());
        	l.setSusp(training.get(x+9).getText());
        	l.setTyres(training.get(x+10).getText());
        	
        	x+=12;
        	this.setLap(l, j);
        	
        }
        
        this.setNumLaps(numLaps);
	}
}
