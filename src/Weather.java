package gproscraping;


public class Weather {

	private String description;
	private String weather;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
}

class RaceForecast{
	
	private Weather atStart;
	private String[] rainProb = new String[4];
	
	public Weather getWeather() {
		return atStart;
	}
	public void setWeather(Weather weather) {
		this.atStart = weather;
	}
	public String getRainProb(int index) {
		return rainProb[index];
	}
	public void setRainProb(String rainProb, int index) {
		this.rainProb[index] = rainProb;
	}

}

