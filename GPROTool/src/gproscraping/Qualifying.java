package gproscraping;

public class Qualifying {

	private Setup setup;
	private String lapTime;
	private Weather weather;
	
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public Setup getSetup() {
		return setup;
	}
	public void setSetup(Setup setup) {
		this.setup = setup;
	}
	public String getLapTime() {
		return lapTime;
	}
	public void setLapTime(String lapTime) {
		this.lapTime = lapTime;
	}
	
}
