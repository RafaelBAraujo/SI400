/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marcelo
 */
public class TestingQuery {
    
    private String season;
    private String rank;
    private String rankDivision;
    private String nameTrack;
    private String managerUsername;
    
    private String lapsDone;
    private String bestLap;
    private String mean;
    private String tyres;
    private String fuel;
    private String fuelLeft;
    private String tyresCond;
    
    private String FWing;
    private String RWing;
    private String Eng;
    private String Bra;
    private String Gear;
    private String Susp;

    private String weather;
    private String temperature;

    public TestingQuery() {
        this.season = ".*";
        this.rank = ".*";
        this.rankDivision = ".*";
        this.nameTrack = ".*";
        this.managerUsername = ".*";
        this.lapsDone = ".*";
        this.bestLap = ".*";
        this.mean = ".*";
        this.tyres = ".*";
        this.fuel = ".*";
        this.fuelLeft = ".*";
        this.tyresCond = ".*";
        this.FWing = ".*";
        this.RWing = ".*";
        this.Eng = ".*";
        this.Bra = ".*";
        this.Gear = ".*";
        this.Susp = ".*";
        this.weather = ".*";
        this.temperature = ".*";
    }

    
    public boolean isEmpty(){
        
        if(
           this.season.compareTo(".*") == 0 &&
           this.rank.compareTo(".*") == 0 &&
                this.rankDivision.compareTo(".*") == 0 &&
                this.managerUsername.compareTo(".*") == 0 &&
                this.tyres.compareTo(".*") == 0 &&
                this.weather.compareTo(".*") == 0 &&
                this.nameTrack.compareTo(".*") == 0 &&
                this.lapsDone.compareTo(".*") == 0 &&
                this.bestLap.compareTo(".*") == 0 &&
                this.mean.compareTo(".*") == 0 &&
                this.tyres.compareTo(".*") == 0 &&
                this.fuel.compareTo(".*") == 0 &&
                this.fuelLeft.compareTo(".*") == 0 &&
                this.tyresCond.compareTo(".*") == 0 &&
                this.FWing.compareTo(".*") == 0 &&
                this.RWing.compareTo(".*") == 0 &&
                this.Eng.compareTo(".*") == 0 &&
                this.Bra.compareTo(".*") == 0 &&
                this.Gear.compareTo(".*") == 0 &&
                this.Susp.compareTo(".*") == 0 &&
                this.weather.compareTo(".*") == 0 &&
                this.temperature.compareTo(".*") == 0 
          ){
            return true;
        }
        else{
            return false;
        }   
    }
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRankDivision() {
        return rankDivision;
    }

    public void setRankDivision(String rankDivision) {
        this.rankDivision = rankDivision;
    }

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public String getLapsDone() {
        return lapsDone;
    }

    public void setLapsDone(String lapsDone) {
        this.lapsDone = lapsDone;
    }

    public String getBestLap() {
        return bestLap;
    }

    public void setBestLap(String bestLap) {
        this.bestLap = bestLap;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
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

    public String getFWing() {
        return FWing;
    }

    public void setFWing(String FWing) {
        this.FWing = FWing;
    }

    public String getRWing() {
        return RWing;
    }

    public void setRWing(String RWing) {
        this.RWing = RWing;
    }

    public String getEng() {
        return Eng;
    }

    public void setEng(String Eng) {
        this.Eng = Eng;
    }

    public String getBra() {
        return Bra;
    }

    public void setBra(String Bra) {
        this.Bra = Bra;
    }

    public String getGear() {
        return Gear;
    }

    public void setGear(String Gear) {
        this.Gear = Gear;
    }

    public String getSusp() {
        return Susp;
    }

    public void setSusp(String Susp) {
        this.Susp = Susp;
    }
    
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

}
