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
    
    public int getTemperature(){
        if(!this.weather.isEmpty()){
            String[] subs = this.weather.split("\n");
            String temp = subs[1] = subs[1].replaceAll("\\D+", "");
            
            return Integer.parseInt(temp);
            
        }
        return -1;
    }
    
    public int getHumidity(){
        if(!this.weather.isEmpty()){
            String[] subs = this.weather.split("\n");
            String temp = subs[2] = subs[2].replaceAll("\\D+", "");
            
            return Integer.parseInt(temp);
            
        }
        return -1;
    }

}