package model;

public class Weather implements java.io.Serializable {

    private static final long serialVersionUID = 3391443190446778268L;

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

class RaceForecast implements java.io.Serializable {

    private static final long serialVersionUID = -4847159854212137806L;

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