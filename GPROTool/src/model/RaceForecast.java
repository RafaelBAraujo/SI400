/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rafael
 */

public class RaceForecast implements java.io.Serializable {

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