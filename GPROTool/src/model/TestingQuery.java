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
    
    private Integer season;
    private String rank;
    private Integer rankDivision;
    private String nameTrack;
    private String managerUsername;
    
    private String lapsDone;
    private String bestLap;
    private String mean;
    private String tyres;
    private Integer fuel;
    private Integer fuelLeft;
    private String tyresCond;
    
    private Integer FWing;
    private Integer RWing;
    private Integer Eng;
    private Integer Bra;
    private Integer Gear;
    private Integer Susp;

    private String weatherDescription;
    private String weather;

    public TestingQuery() {
        this.season = null;
        this.rank = "";
        this.rankDivision = null;
        this.nameTrack = "";
        this.lapsDone = "";
        this.bestLap = "";
        this.mean = "";
        this.tyres = "";
        this.fuel = null;
        this.fuelLeft = null;
        this.tyresCond = "";
        this.FWing = null;
        this.RWing = null;
        this.Eng = null;
        this.Bra = null;
        this.Gear = null;
        this.Susp = null;
        this.weatherDescription = "";
        this.weather = "";
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getRankDivision() {
        return rankDivision;
    }

    public void setRankDivision(Integer rankDivision) {
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

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(Integer fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public String getTyresCond() {
        return tyresCond;
    }

    public void setTyresCond(String tyresCond) {
        this.tyresCond = tyresCond;
    }

    public Integer getFWing() {
        return FWing;
    }

    public void setFWing(Integer FWing) {
        this.FWing = FWing;
    }

    public Integer getRWing() {
        return RWing;
    }

    public void setRWing(Integer RWing) {
        this.RWing = RWing;
    }

    public Integer getEng() {
        return Eng;
    }

    public void setEng(Integer Eng) {
        this.Eng = Eng;
    }

    public Integer getBra() {
        return Bra;
    }

    public void setBra(Integer Bra) {
        this.Bra = Bra;
    }

    public Integer getGear() {
        return Gear;
    }

    public void setGear(Integer Gear) {
        this.Gear = Gear;
    }

    public Integer getSusp() {
        return Susp;
    }

    public void setSusp(Integer Susp) {
        this.Susp = Susp;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

}
