/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rafael, Marcelo
 */
public class Testing implements java.io.Serializable {
    
    private static final long serialVersionUID = -2729487164148785749L;
    
    private Race race;
    private TestingStint[] stints;
    private Weather testingWeather;
    private Weather testingDescription;

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
    
    public Weather getTestingDescription() {
        return testingDescription;
    }

    public void setTestingDescription(Weather testingDescription) {
        this.testingDescription = testingDescription;
    }
    
    public Testing(){
        stints = new TestingStint[10];
    }    

    public TestingStint[] getStints() {
        return stints;
    }

    public void setStints(TestingStint[] stints) {
        this.stints = stints;
    }

    public Weather getTestingWeather() {
        return testingWeather;
    }

    public void setTestingWeather(Weather testingWeather) {
        this.testingWeather = testingWeather;
    }
    
}
