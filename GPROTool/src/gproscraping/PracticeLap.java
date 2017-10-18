package gproscraping;

import java.io.Serializable;

public class PracticeLap implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getLapTime() {
		return lapTime;
	}
	public void setLapTime(String lapTime) {
		this.lapTime = lapTime;
	}
	public String getDriverMistake() {
		return driverMistake;
	}
	public void setDriverMistake(String driverMistake) {
		this.driverMistake = driverMistake;
	}
	public String getNetTime() {
		return netTime;
	}
	public void setNetTime(String netTime) {
		this.netTime = netTime;
	}
	public String getfWing() {
		return fWing;
	}
	public void setfWing(String fWing) {
		this.fWing = fWing;
	}
	public String getrWing() {
		return rWing;
	}
	public void setrWing(String rWing) {
		this.rWing = rWing;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getBrakes() {
		return brakes;
	}
	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}
	public String getSusp() {
		return susp;
	}
	public void setSusp(String susp) {
		this.susp = susp;
	}
	public String getTyres() {
		return tyres;
	}
	public void setTyres(String tyres) {
		this.tyres = tyres;
	}
	
	private String lapTime;
	private String driverMistake;
	private String netTime;
	private String fWing;
	private String rWing;
	private String engine;
	private String brakes;
	private String gear;
	private String susp;
	private String tyres;

}
