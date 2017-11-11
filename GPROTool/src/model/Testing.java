/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

class TestingLap implements java.io.Serializable {
    
    private static final long serialVersionUID = 1473415859796723863L;
    
    private String lapsDone;
    private String bestlap;
    private String mean;
    private Setup lapSetup;
    private String tyres;
    private String fuel;
    private String fuelLeft;
    private String tyresCond;

    public String getLapsDone() {
        return lapsDone;
    }

    public void setLapsDone(String lapsDone) {
        this.lapsDone = lapsDone;
    }

    public String getBestlap() {
        return bestlap;
    }

    public void setBestlap(String bestlap) {
        this.bestlap = bestlap;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public Setup getLapSetup() {
        return lapSetup;
    }

    public void setLapSetup(Setup lapSetup) {
        this.lapSetup = lapSetup;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(String fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public String getTyresCond() {
        return tyresCond;
    }

    public void setTyresCond(String tyresCond) {
        this.tyresCond = tyresCond;
    }
    
}

/**
 *
 * @author Rafael, Marcelo
 */
public class Testing implements java.io.Serializable {
    
    private static final long serialVersionUID = -2729487164148785749L;
    
    private TestingLap[] stints;
    private Weather testingWeather;
    
    public Testing(){
        stints = new TestingLap[10];
    }    

    public TestingLap[] getStints() {
        return stints;
    }

    public void setStints(TestingLap[] stints) {
        this.stints = stints;
    }

    public Weather getTestingWeather() {
        return testingWeather;
    }

    public void setTestingWeather(Weather testingWeather) {
        this.testingWeather = testingWeather;
    }

    
}
