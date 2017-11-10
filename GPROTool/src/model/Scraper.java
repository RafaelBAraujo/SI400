package model;

import java.util.List;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Scraper {

    public Practice readPractice() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        List<WebElement> training = h.getDriver().findElements(By.cssSelector("tr.pointerhand td"));

        Practice p = new Practice();
        int x = 0;
        //int numLaps = 0;

        for (int j = 0; j < 8; j++) {

            PracticeLap l = new PracticeLap();

            if ((x + 1) > training.size()) {
                break;
            }

            //numLaps++;
            l.setLapTime(training.get(x + 1).getText());
            l.setDriverMistake(training.get(x + 2).getText());
            l.setNetTime(training.get(x + 3).getText());
            l.setfWing(training.get(x + 4).getText());
            l.setrWing(training.get(x + 5).getText());
            l.setEngine(training.get(x + 6).getText());
            l.setBrakes(training.get(x + 7).getText());
            l.setGear(training.get(x + 8).getText());
            l.setSusp(training.get(x + 9).getText());
            l.setTyres(training.get(x + 10).getText());

            x += 12;
            p.setLap(l, j);

        }

        //p.printLaps(numLaps);
        return p;
    }

    public RaceWear readRaceWear() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        List<WebElement> carWear = h.getDriver().findElements(By.cssSelector("div.column.right.fiftyfive table.styled.bordered.center tbody tr td"));

        Wear startWear = new Wear();
        Wear endWear = new Wear();

        startWear.setCha(carWear.get(22).getText());
        startWear.setEng(carWear.get(23).getText());
        startWear.setfWing(carWear.get(24).getText());
        startWear.setrWing(carWear.get(25).getText());
        startWear.setUnderb(carWear.get(26).getText());
        startWear.setSidep(carWear.get(27).getText());
        startWear.setCool(carWear.get(28).getText());
        startWear.setGear(carWear.get(29).getText());
        startWear.setBra(carWear.get(30).getText());
        startWear.setSusp(carWear.get(31).getText());
        startWear.setElec(carWear.get(32).getText());

        endWear.setCha(carWear.get(33).getText());
        endWear.setEng(carWear.get(34).getText());
        endWear.setfWing(carWear.get(35).getText());
        endWear.setrWing(carWear.get(36).getText());
        endWear.setUnderb(carWear.get(37).getText());
        endWear.setSidep(carWear.get(38).getText());
        endWear.setCool(carWear.get(39).getText());
        endWear.setGear(carWear.get(40).getText());
        endWear.setBra(carWear.get(41).getText());
        endWear.setSusp(carWear.get(42).getText());
        endWear.setElec(carWear.get(43).getText());

        RaceWear rw = new RaceWear();
        rw.setStartWear(startWear);
        rw.setFinalWear(endWear);

        return rw;

    }

    public Qualifyings readQualifying() {

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

        Qualifyings qualifyings = new Qualifyings();
        qualifyings.setQ1(Q1);
        qualifyings.setQ2(Q2);

        return qualifyings;

    }

    public Strategy readStrategy() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        List<WebElement> qualifying = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));

        Strategy myStrategy = new Strategy();
        Setup raceSetup = new Setup();

        raceSetup.FWing = qualifying.get(27).getText();
        raceSetup.RWing = qualifying.get(28).getText();
        raceSetup.Eng = qualifying.get(29).getText();
        raceSetup.Bra = qualifying.get(30).getText();
        raceSetup.Gear = qualifying.get(31).getText();
        raceSetup.Susp = qualifying.get(32).getText();
        raceSetup.Tyres = qualifying.get(33).getText();

        myStrategy.setRaceSetup(raceSetup);

        List<WebElement> risks = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));

        myStrategy.setStartingRisk(risks.get(34).getText());
        myStrategy.setOvertake(risks.get(35).getText());
        myStrategy.setDefend(risks.get(36).getText());
        myStrategy.setCtDry(risks.get(37).getText());
        myStrategy.setCtWet(risks.get(38).getText());
        myStrategy.setMalfunc(risks.get(39).getText());

        List<WebElement> startFuel = h.getDriver().findElements(
                By.cssSelector(
                        "div#contentinner div.inner div div.column.left.fortyfive.nomargin div.inner b"));

        String regex = "\\d{0,3}+\\s+liters";

        for (WebElement s : startFuel) {
            if (s.getText().matches(regex)) {
                myStrategy.setStartFuel(s.getText());
                break;
            }
        }

        return myStrategy;

    }

    public Pilot readPilot() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        List<WebElement> stats = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));

        int driverIndex = 0;
        for (int j = 0; j < stats.size(); j++) {
            if (stats.get(j).getText().compareTo("Race") == 0) {
                driverIndex = j + 14;
                break;
            }
        }

        if (driverIndex == 0) {
            System.out.println("Could not scrape pilot!");
            return null;
        }

        Pilot myPilot = new Pilot();
        myPilot.setName(stats.get(driverIndex).getText());
        myPilot.setOa(Integer.parseInt(stats.get(driverIndex + 1).getText()));
        myPilot.setCon(Integer.parseInt(stats.get(driverIndex + 2).getText()));
        myPilot.setTal(Integer.parseInt(stats.get(driverIndex + 3).getText()));
        myPilot.setAgr(Integer.parseInt(stats.get(driverIndex + 4).getText()));
        myPilot.setExp(Integer.parseInt(stats.get(driverIndex + 5).getText()));
        myPilot.setTeI(Integer.parseInt(stats.get(driverIndex + 6).getText()));
        myPilot.setSta(Integer.parseInt(stats.get(driverIndex + 7).getText()));
        myPilot.setCha(Integer.parseInt(stats.get(driverIndex + 8).getText()));
        myPilot.setMot(Integer.parseInt(stats.get(driverIndex + 9).getText()));
        myPilot.setRep(Integer.parseInt(stats.get(driverIndex + 10).getText()));
        myPilot.setWeight(Integer.parseInt(stats.get(driverIndex + 11).getText()));

        String[] newPtsStrings = new String[11];
        int[] newPoints = new int[11];

        for (int i = 0; i < 11; i++) {
            newPtsStrings[i] = stats.get(52 + i).getText().split("[\\(\\)]")[1];
            if (newPtsStrings[i].indexOf('-') == (-1) && newPtsStrings[i].indexOf('+') == (-1)) {
                newPoints[i] = 0;
            } else if (newPtsStrings[i].indexOf('+') == 0) {
                String numberString = newPtsStrings[i].substring(newPtsStrings[i].indexOf('+') + 1);
                newPoints[i] = Integer.parseInt(numberString);
            } else if (newPtsStrings[i].indexOf('-') == 0) {
                String numberString = newPtsStrings[i].substring(newPtsStrings[i].indexOf('-') + 1);
                newPoints[i] = (Integer.parseInt(numberString) * (-1));
            }
            //System.out.println(newPtsStrings[i].indexOf('+')+":" + newPtsStrings[i]);
            //System.out.println("new: "+newPoints[i].charAt(0));
            //indexOf
            //charAt

        }

        //for(int d : newPoints){
        //System.out.println(d);
        //}
        List<WebElement> raceEnergy = h.getDriver().findElements(By.cssSelector("div.barLabel"));
        myPilot.setStartEnergy(raceEnergy.get(0).getText());
        myPilot.setEndEnergy(raceEnergy.get(1).getText());

        return myPilot;

    }

    public void readWeather(Qualifyings qual, Race race) {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        WebElement weather = h.getDriver().findElement(By.name("WeatherQ"));
        qual.getQ1().getWeather().setDescription(weather.getAttribute("alt"));
        //System.out.println(weather.getAttribute("alt"));

        weather = h.getDriver().findElement(By.name("WeatherR"));
        qual.getQ2().getWeather().setDescription(weather.getAttribute("alt"));
        //System.out.println(weather.getAttribute("alt"));

        List<WebElement> weathers = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));

        qual.getQ1().getWeather().setWeather(weathers.get(68).getText());

        qual.getQ2().getWeather().setWeather(weathers.get(69).getText());

        race.getRaceForecast().setWeather(qual.getQ2().getWeather());

        for (int t = 0; t < 4; t++) {
            race.getRaceForecast().setRainProb(weathers.get(70 + t).getText(), t);
        }

    }

    public Weather readQ1Weather() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        WebElement weather = h.getDriver().findElement(By.name("WeatherQ"));

        Weather q1 = new Weather();
        q1.setDescription(weather.getAttribute("alt"));

        List<WebElement> weathers = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));

        q1.setWeather(weathers.get(68).getText());

        return q1;
    }

    public Weather readQ2Weather() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        WebElement weather = h.getDriver().findElement(By.name("WeatherR"));

        Weather q2 = new Weather();
        q2.setDescription(weather.getAttribute("alt"));

        List<WebElement> weathers = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));
        q2.setWeather(weathers.get(69).getText());

        return q2;
    }

    public RaceForecast readForecast() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        RaceForecast rf = new RaceForecast();

        Weather raceStart = this.readQ2Weather();
        rf.setWeather(raceStart);

        List<WebElement> weathers = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table.styled.bordered.center tbody tr td"));

        for (int t = 0; t < 4; t++) {
            rf.setRainProb(weathers.get(70 + t).getText(), t);
        }

        return rf;
    }

    public Car readCar() {

        try {

            ConnectionHandler h = ConnectionHandler.getHandler();
            h.openHome();
            
            // getting ID - season, rank, rankDivision, manager's name
            List<WebElement> rank = h.getDriver().findElements(By.cssSelector("div #columnone #item-1 table tbody tr.even td a"));

            Car myCar = new Car();
            String[] substrings = rank.get(1).getText().split(" - ");
            myCar.setRank(substrings[0]);
            myCar.setRankDivision(Integer.parseInt(substrings[1]));
            
            List<WebElement> managersName = h.getDriver().findElements(By.cssSelector("#item-1 h1 a.nobold"));
            myCar.setManagerName(managersName.get(0).getText());
 
            h.openRaceAnalisys();

            List<WebElement> seasonNumber = h.getDriver().findElements(By.cssSelector("div.inner div h1.block.center"));

            substrings = seasonNumber.get(0).getText().split(" - ");

            myCar.setSeason(Integer.parseInt(substrings[1].substring(substrings[1].indexOf(" ") + 1)));

            List<WebElement> carCharac = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div table.styled.nobordered.center tbody tr td table tbody tr td"));

            /*for(int j = 0; j < carCharac.size(); j++){
				System.out.println(j+": " + carCharac.get(j).getText());
			}*/
            myCar.setPower(carCharac.get(2).getText());
            myCar.setHandling(carCharac.get(3).getText());
            myCar.setAcceleration(carCharac.get(4).getText());

            /*List<WebElement> fuel = h.getDriver().findElements(
					By.cssSelector("div.column.left.fortyfive.nomargin div.inner b"));
			
			for(int j = 0; j < fuel.size(); j++){
				System.out.println(j+": " + fuel.get(j).getText());
			}
			
			myCar.setTyreSupplier(fuel.get(8).getText());
			myCar.setStartFuel(fuel.get(11).getText());
			myCar.setEndFuel(fuel.get(21).getText());
			myCar.setEndTyreWear(fuel.get(20).getText());*/
            List<WebElement> partsLevels = h.getDriver().findElements(By.cssSelector("div.column.right.fiftyfive table.styled.bordered.center tbody tr td"));

            myCar.setCha(partsLevels.get(11).getText());
            myCar.setEng(partsLevels.get(12).getText());
            myCar.setfWing(partsLevels.get(13).getText());
            myCar.setrWing(partsLevels.get(14).getText());
            myCar.setUnderb(partsLevels.get(15).getText());
            myCar.setSidep(partsLevels.get(16).getText());
            myCar.setCool(partsLevels.get(17).getText());
            myCar.setGear(partsLevels.get(18).getText());
            myCar.setBra(partsLevels.get(19).getText());
            myCar.setSusp(partsLevels.get(20).getText());
            myCar.setElec(partsLevels.get(21).getText());

            return myCar;
        } catch (Exception e) {
            System.out.println("The program could not read/save the car data!");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public PitStop readPitStops() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openRaceAnalisys();

        List<WebElement> pit = h.getDriver().findElements(By.cssSelector("div.column.left.fortyfive.nomargin div.inner table#Table4.styled.bordered.leftalign tbody tr td"));

        Pit p;
        PitStop ps = new PitStop();
        int x = 0;

        for (int i = 0; i < ((pit.size() + 1) / 6); i++) {
            p = new Pit();

            p.pitLap = pit.get(x).getText();
            p.pitReason = pit.get(x + 1).getText();
            p.tyresCond = pit.get(x + 2).getText();
            p.fuelLeft = pit.get(x + 3).getText();
            p.refill = pit.get(x + 4).getText();
            p.pitTime = pit.get(x + 5).getText();
            x += 6;
            ps.getP().add(p);
        }

        //ps.printAllPits();
        return ps;

    }

    public Race readRace() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openHome();

        List<WebElement> rank = h.getDriver().findElements(By.cssSelector("div #columnone #item-1 table tbody tr.even td a"));

        Race r = new Race();
        String[] substrings = rank.get(1).getText().split(" - ");
        r.setRank(substrings[0]);
        r.setRankDivision(Integer.parseInt(substrings[1]));

        h.openRaceAnalisys();

        List<WebElement> info = h.getDriver().findElements(By.cssSelector("div.inner div h1.block.center"));

        substrings = info.get(0).getText().split(" - ");

        r.setSeason(Integer.parseInt(substrings[1].substring(substrings[1].indexOf(" ") + 1)));
        r.setRaceNumber(Integer.parseInt(substrings[2].substring(substrings[2].indexOf(" ") + 1)));
        info = null;

        List<WebElement> race = h.getDriver().findElements(By.cssSelector("div.column.right.fiftyfive table.styled.borderbottom tbody tr td"));

        /*for(int j = 0; j < raceTrack.size(); j++){
			System.out.println(j+": " + raceTrack.get(j).getText());
		}*/
        //System.out.println("\n\n\nFUCKING SHIT  " + race.size() + "\n\n");
        int x = 8;
        Lap l;

        for (int i = 0; i < ((race.size() + 1) / 8) - 1; i++) {

            l = new Lap();
            l.lapNumber = race.get(x).getText();
            l.lapTime = race.get(x + 1).getText();
            l.pos = race.get(x + 2).getText();
            l.tyre = race.get(x + 3).getText();
            l.weather = race.get(x + 4).getText();
            l.temp = race.get(x + 5).getText();
            l.Hum = race.get(x + 6).getText();
            l.events = race.get(x + 7).getText();

            x += 8;
            r.getLaps().add(l);

        }

        //r.printAllLaps();
        List<WebElement> finances = h.getDriver().findElements(By.cssSelector("div#dvFinAnalisysTable table#Table1.styled.bordered tbody tr td"));

        for (int y = 0; y < finances.size(); y++) {
            if (finances.get(y).getText().equals("Total:")) {
                r.setMoneyEarned(finances.get(y + 1).getText());
                break;
            } else {
                continue;
            }
        }

        return r;

    }

    public Tracks readTracks() {

        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openTrackList();

        List<WebElement> trackList = h.getDriver().findElements(
                By.cssSelector("table.styled.borderbottom.flag tbody td"));

        Tracks t = new Tracks();
        Track newTrack;

        int x = 0;
        for (int i = 0; i < ((trackList.size() + 1) / 10); i++) {

            List<WebElement> trackList2 = h.getDriver().findElements(
                    By.cssSelector("table.styled.borderbottom.flag tbody td"));

            newTrack = new Track();
            newTrack.setTrackName(trackList2.get(x).getText());
            newTrack.setLocation(trackList2.get(x + 1).getText());
            newTrack.setRaceDistance(trackList2.get(x + 2).getText());
            newTrack.setLaps(trackList2.get(x + 3).getText());
            newTrack.setLapDistance(trackList2.get(x + 4).getText());
            newTrack.setCategory(trackList2.get(x + 8).getText());
            newTrack.setGPHeld(trackList2.get(x + 9).getText());
            String trackURL = trackList2.get(x + 0).findElement(By.cssSelector("a")).getAttribute("href");
            String[] parts = trackURL.split(Pattern.quote("."));

            System.out.println(trackList2.get(x).getText());

            h.getDriver().findElement(By.xpath("//a[@href='TrackDetails." + parts[3] + "']")).click();

            List<WebElement> trackInfo = h.getDriver().findElements(
                    By.cssSelector("div.inner div table.styled tbody tr td table.styled.paddedsmall tbody tr td"));

            newTrack.setDate(trackInfo.get(7).getText());
            newTrack.setAvgSpeed(trackInfo.get(23).getText());
            newTrack.setNumOfCorners(trackInfo.get(31).getText());
            newTrack.setPitTime(trackInfo.get(35).getText());
            newTrack.setPower(trackInfo.get(5).getAttribute("title"));
            newTrack.setHandling(trackInfo.get(9).getAttribute("title"));
            newTrack.setAcceleration(trackInfo.get(13).getAttribute("title"));
            newTrack.setDownforce(trackInfo.get(17).getText());
            newTrack.setOvertaking(trackInfo.get(21).getText());
            newTrack.setSuspRigidity(trackInfo.get(25).getText());
            newTrack.setFuelConsumption(trackInfo.get(29).getText());
            newTrack.setTyreWear(trackInfo.get(33).getText());
            newTrack.setGripLevel(trackInfo.get(37).getText());

            x += 10;
            h.getDriver().findElement(By.xpath("//a[@href='/gb/gpro.asp']")).click();
            h.openTrackList();
            t.getTracks().add(newTrack);

        }

        return t;
    }

    public static Integer readTrackListSize(){
        
        Integer size;
        
        ConnectionHandler h = ConnectionHandler.getHandler();
        h.openTrackList();

        List<WebElement> trackList = h.getDriver().findElements(
                By.cssSelector("table.styled.borderbottom.flag tbody td"));
        
        size = trackList.size() / 10;
        
        return size;
    }
    
    
}
