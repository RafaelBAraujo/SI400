package gproscraping;

public class Strategy {

	private Setup raceSetup;
	
	public Setup getRaceSetup() {
		return raceSetup;
	}
	public void setRaceSetup(Setup raceSetup) {
		this.raceSetup = raceSetup;
	}
	
	private String startingRisk;
	private String overtake;
	private String defend;
	private String ctDry;
	private String ctWet;
	private String malfunc;
	private String startFuel;
	
	public String getStartingRisk() {
		return startingRisk;
	}
	public void setStartingRisk(String startingRisk) {
		this.startingRisk = startingRisk;
	}
	public String getOvertake() {
		return overtake;
	}
	public void setOvertake(String overtake) {
		this.overtake = overtake;
	}
	public String getDefend() {
		return defend;
	}
	public void setDefend(String defend) {
		this.defend = defend;
	}
	public String getCtDry() {
		return ctDry;
	}
	public void setCtDry(String ctDry) {
		this.ctDry = ctDry;
	}
	public String getCtWet() {
		return ctWet;
	}
	public void setCtWet(String ctWet) {
		this.ctWet = ctWet;
	}
	public String getMalfunc() {
		return malfunc;
	}
	public void setMalfunc(String malfunc) {
		this.malfunc = malfunc;
	}
	public String getStartFuel() {
		return startFuel;
	}
	public void setStartFuel(String startFuel) {
		this.startFuel = startFuel;
	}

}
