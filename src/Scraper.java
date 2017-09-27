package gproscraping;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Scraper {

	public void readPractice(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		List<WebElement> training = h.getDriver().findElements(By.cssSelector("tr.pointerhand td"));
		
		Practice p = new Practice();
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
        	p.setLap(l, j);
        	
        }
        
        p.printLaps(numLaps);
	}
	
	public void readCarWear(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		List<WebElement> carWear = h.getDriver().findElements(By.cssSelector("div.column.right.fiftyfive table.styled.bordered.center tbody tr td"));
        
        Wear partsLevels = new Wear();
        Wear startWear = new Wear();
        Wear endWear = new Wear();

        partsLevels.Cha = carWear.get(11).getText();
        partsLevels.Eng = carWear.get(12).getText();
        partsLevels.FWing = carWear.get(13).getText();
        partsLevels.RWing = carWear.get(14).getText();
        partsLevels.Underb = carWear.get(15).getText();
        partsLevels.Sidep = carWear.get(16).getText();
        partsLevels.Cool = carWear.get(17).getText();
        partsLevels.Gear = carWear.get(18).getText();
        partsLevels.Bra = carWear.get(19).getText();
        partsLevels.Susp = carWear.get(20).getText();
        partsLevels.Elec = carWear.get(21).getText();
        
        startWear.Cha = carWear.get(22).getText();
        startWear.Eng = carWear.get(23).getText();
        startWear.FWing = carWear.get(24).getText();
        startWear.RWing = carWear.get(25).getText();
        startWear.Underb = carWear.get(26).getText();
        startWear.Sidep = carWear.get(27).getText();
        startWear.Cool = carWear.get(28).getText();
        startWear.Gear = carWear.get(29).getText();
        startWear.Bra = carWear.get(30).getText();
        startWear.Susp = carWear.get(31).getText();
        startWear.Elec = carWear.get(32).getText();
        
        endWear.Cha = carWear.get(33).getText();
        endWear.Eng = carWear.get(34).getText();
        endWear.FWing = carWear.get(35).getText();
        endWear.RWing = carWear.get(36).getText();
        endWear.Underb = carWear.get(37).getText();
        endWear.Sidep = carWear.get(38).getText();
        endWear.Cool = carWear.get(39).getText();
        endWear.Gear = carWear.get(40).getText();
        endWear.Bra = carWear.get(41).getText();
        endWear.Susp = carWear.get(42).getText();
        endWear.Elec = carWear.get(43).getText();

        partsLevels.printAll();
        startWear.printAll();
        endWear.printAll();
        
        
        /*Car myCar = new Car();
        myCar.setPartLevels(partsLevels);
        myCar.setStartWear(startWear);
        myCar.setEndWear(endWear);*/
        
        /*System.out.println(a.Cha);
        System.out.println(a.Eng);
        System.out.println(a.FWing);
        System.out.println(a.RWing);
        System.out.println(a.Underb);
        System.out.println(a.Sidep);
        System.out.println(a.Cool);
        System.out.println(a.Gear);
        System.out.println(a.Bra);
        System.out.println(a.Susp);
        System.out.println(a.Elec);
        
        System.out.println(b.Cha);
        System.out.println(b.Eng);
        System.out.println(b.FWing);
        System.out.println(b.RWing);
        System.out.println(b.Underb);
        System.out.println(b.Sidep);
        System.out.println(b.Cool);
        System.out.println(b.Gear);
        System.out.println(b.Bra);
        System.out.println(b.Susp);
        System.out.println(b.Elec);
		
        System.out.println(c.Cha);
        System.out.println(c.Eng);
        System.out.println(c.FWing);
        System.out.println(c.RWing);
        System.out.println(c.Underb);
        System.out.println(c.Sidep);
        System.out.println(c.Cool);
        System.out.println(c.Gear);
        System.out.println(c.Bra);
        System.out.println(c.Susp);
        System.out.println(c.Elec);*/
	}
	
	public void readQualifying(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		List<WebElement> qualifying = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));
		
		/*for(int j = 0; j < qualifying.size(); j++){
			System.out.println(j+": " + qualifying.get(j).getText());
		}*/
		
		Qualifying Q1 = new Qualifying();
		Q1.setLapTime(qualifying.get(0).getText());
		
        Setup q1Setup = new Setup();
        
        q1Setup.FWing = qualifying.get(11).getText();
        q1Setup.RWing = qualifying.get(12).getText();
        q1Setup.Eng = qualifying.get(13).getText();
        q1Setup.Bra = qualifying.get(14).getText();
        q1Setup.Gear = qualifying.get(15).getText();
        q1Setup.Susp = qualifying.get(16).getText();
        q1Setup.Tyres = qualifying.get(17).getText();
        
        Q1.setSetup(q1Setup);
        
        Qualifying Q2 = new Qualifying();
        Q2.setLapTime(qualifying.get(1).getText());
        
        Setup q2Setup = new Setup();
        
        q2Setup.FWing = qualifying.get(19).getText();
        q2Setup.RWing = qualifying.get(20).getText();
        q2Setup.Eng = qualifying.get(21).getText();
        q2Setup.Bra = qualifying.get(22).getText();
        q2Setup.Gear = qualifying.get(23).getText();
        q2Setup.Susp = qualifying.get(24).getText();
        q2Setup.Tyres = qualifying.get(25).getText();
        
        Q2.setSetup(q2Setup);
        
        Qualifying Race = new Qualifying();
        Race.setLapTime(null);
        
        Setup raceSetup = new Setup();
        
        raceSetup.FWing = qualifying.get(27).getText();
        raceSetup.RWing = qualifying.get(28).getText();
        raceSetup.Eng = qualifying.get(29).getText();
        raceSetup.Bra = qualifying.get(30).getText();
        raceSetup.Gear = qualifying.get(31).getText();
        raceSetup.Susp = qualifying.get(32).getText();
        raceSetup.Tyres = qualifying.get(33).getText();
		
        Race.setSetup(raceSetup);
        
        System.out.println("Q1 lap time: " + Q1.getLapTime());
        Q1.getSetup().printAll();
        System.out.println("Q2 lap time: " + Q2.getLapTime());
        Q2.getSetup().printAll();
        Race.getSetup().printAll();
        
	}
	
	public void readRisk(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		List<WebElement> risks = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));
		
		Risk myRisk = new Risk();
		myRisk.setStartingRisk(risks.get(34).getText());
		myRisk.setOvertake(risks.get(35).getText());
		myRisk.setDefend(risks.get(36).getText());
		myRisk.setCtDry(risks.get(37).getText());
		myRisk.setCtWet(risks.get(38).getText());
		myRisk.setMalfunc(risks.get(39).getText());
		
		
		
	}
	
	public Pilot readPilot(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		List<WebElement> stats = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));
        
		int driverIndex = 0;
        for(int j = 0; j < stats.size(); j++){
        	if(stats.get(j).getText().compareTo("Race") == 0){
        		driverIndex = j + 14;
        		break;
        	}
		}

        if(driverIndex == 0){
        	System.out.println("Could not scrape pilot!");
        	return null;
        }
                
		Pilot myPilot = new Pilot();
		myPilot.setName(stats.get(driverIndex).getText());
		myPilot.setOa(Integer.parseInt(stats.get(driverIndex+1).getText()));
		myPilot.setCon(Integer.parseInt(stats.get(driverIndex+2).getText()));
		myPilot.setTal(Integer.parseInt(stats.get(driverIndex+3).getText()));
		myPilot.setAgr(Integer.parseInt(stats.get(driverIndex+4).getText()));
		myPilot.setExp(Integer.parseInt(stats.get(driverIndex+5).getText()));
		myPilot.setTeI(Integer.parseInt(stats.get(driverIndex+6).getText()));
		myPilot.setSta(Integer.parseInt(stats.get(driverIndex+7).getText()));
		myPilot.setCha(Integer.parseInt(stats.get(driverIndex+8).getText()));
		myPilot.setMot(Integer.parseInt(stats.get(driverIndex+9).getText()));
		myPilot.setRep(Integer.parseInt(stats.get(driverIndex+10).getText()));
		myPilot.setWeight(Integer.parseInt(stats.get(driverIndex+11).getText()));
		
		String[] newPtsStrings = new String[11];
		int[] newPoints = new int[11];
		
		for(int i = 0; i < 11; i++){
			newPtsStrings[i] = stats.get(52 + i).getText().split("[\\(\\)]")[1];
			if(newPtsStrings[i].indexOf('-') == (-1) && newPtsStrings[i].indexOf('+') == (-1)){
				newPoints[i] = 0;
			}
			else if(newPtsStrings[i].indexOf('+') == 0){
				String numberString = newPtsStrings[i].substring(newPtsStrings[i].indexOf('+')+1);
				newPoints[i] = Integer.parseInt(numberString);
			}
			else if(newPtsStrings[i].indexOf('-') == 0){
				String numberString = newPtsStrings[i].substring(newPtsStrings[i].indexOf('-')+1);
				newPoints[i] = (Integer.parseInt(numberString)*(-1));
			}
			//System.out.println(newPtsStrings[i].indexOf('+')+":" + newPtsStrings[i]);
			//System.out.println("new: "+newPoints[i].charAt(0));
                        //indexOf
                        //charAt
                        
		}
		
		for(int d : newPoints){
			System.out.println(d);
		}
		List<WebElement> raceEnergy = h.getDriver().findElements(By.cssSelector("div.barLabel"));
		myPilot.setStartEnergy(raceEnergy.get(0).getText());
		myPilot.setEndEnergy(raceEnergy.get(1).getText());
                
        return myPilot;

	}
	
	public void readWeather(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		Weather q1 = new Weather();
		Weather q2 = new Weather();
		
		WebElement weather = h.getDriver().findElement(By.name("WeatherQ"));
		q1.setDescription(weather.getAttribute("alt"));
		System.out.println(q1.getDescription());
		
		weather = h.getDriver().findElement(By.name("WeatherR"));
		q2.setDescription(weather.getAttribute("alt"));
		System.out.println(q2.getDescription());
		
		List<WebElement> weathers = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));
		
		q1.setWeather(weathers.get(68).getText());
		
		q2.setWeather(weathers.get(69).getText());
		
		RaceForecast raceForecast = new RaceForecast();
		raceForecast.setWeather(q2);
		System.out.println(q1.getWeather());
		System.out.println(q2.getWeather());
		
		for(int t = 0; t < 4; t++){
			raceForecast.setRainProb(weathers.get(70+t).getText(), t);
		}
		
		for(int t = 0; t < 4; t++){
			System.out.println(raceForecast.getRainProb(t));
		}
		
		
	}
	
	public void readCar(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
		
		List<WebElement> carCharac = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));
		
		Car myCar = new Car();
		myCar.setPower(carCharac.get(65).getText());
		myCar.setHandling(carCharac.get(66).getText());
		myCar.setAcceleration(carCharac.get(67).getText());
		
		List<WebElement> fuel = h.getDriver().findElements(
				By.cssSelector("div.column.left.fortyfive.nomargin div.inner b"));
		
		for(int j = 0; j < fuel.size(); j++){
			System.out.println(j+": " + fuel.get(j).getText());
		}
		
		myCar.setTyreSupplier(fuel.get(8).getText());
		myCar.setStartFuel(fuel.get(11).getText());
		myCar.setEndFuel(fuel.get(21).getText());
		myCar.setEndTyreWear(fuel.get(20).getText());
		
	}

	public void readPit(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openRaceAnalisys();
                
		List<WebElement> pit = h.getDriver().findElements
		(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table#Table4.styled.bordered.leftalign tbody tr td"));
		
		Pit p;
		PitStop pS = new PitStop();
		int x = 0;
		
		for(int i = 0; i < ((pit.size()+1)/6); i++){
			p = new Pit();
			
			p.pitLap = pit.get(x).getText();
			p.pitReason = pit.get(x+1).getText();
			p.tyresCond = pit.get(x+2).getText();
			p.fuelLeft = pit.get(x+3).getText();
			p.refill = pit.get(x+4).getText();
			p.pitTime = pit.get(x+5).getText();
			x+=6;
			pS.getP().add(p);
		}
		
		pS.printAllPits();
		
	}

	public Race readRace(){
		
		ConnectionHandler h = ConnectionHandler.getHandler();
		h.openHome();
		
		List<WebElement> rank = h.getDriver().findElements
				(By.cssSelector("div #columnone #item-1 table tbody tr.even td a"));
		
		Race r = new Race();
		String[] substrings = rank.get(1).getText().split(" - ");
		r.setRank(substrings[0]);
		r.setRankDivision(Integer.parseInt(substrings[1]));
		
		h.openRaceAnalisys();
		
		List<WebElement> info = h.getDriver().findElements
				(By.cssSelector("div.inner div h1.block.center"));
		
		substrings = info.get(0).getText().split(" - ");
		
		r.setSeason(Integer.parseInt(substrings[1].substring(substrings[1].indexOf(" ")+1)));
		r.setRaceNumber(Integer.parseInt(substrings[2].substring(substrings[2].indexOf(" ")+1)));
		info = null;
		
		List<WebElement> race = h.getDriver().findElements
		(By.cssSelector("div.column.right.fiftyfive table.styled.borderbottom tbody tr td"));
		
		
		/*for(int j = 0; j < raceTrack.size(); j++){
			System.out.println(j+": " + raceTrack.get(j).getText());
		}*/
		//System.out.println("\n\n\nFUCKING SHIT  " + race.size() + "\n\n");
		
		int x = 8;
		Lap l;
		
		for(int i = 0; i < ((race.size()+1)/8)-1; i++){
			
			l = new Lap();
			l.lapNumber = race.get(x).getText();
			l.lapTime = race.get(x+1).getText();
			l.pos = race.get(x+2).getText();
			l.tyre = race.get(x+3).getText();
			l.weather = race.get(x+4).getText();
			l.temp = race.get(x+5).getText();
			l.Hum = race.get(x+6).getText();
			l.events = race.get(x+7).getText();
			
			x+=8;
			r.getLaps().add(l);

		}
		
		r.printAllLaps();
		
		List<WebElement> finances = h.getDriver().findElements
		(By.cssSelector("div#dvFinAnalisysTable table#Table1.styled.bordered tbody tr td"));
		
		for(int y = 0; y < finances.size(); y++){
			if(finances.get(y).getText().equals("Total:")){
				r.setMoneyEarned(finances.get(y+1).getText());
				break;
			}
			else
				continue;
		}
		
		return r;
		
	}
	
}




