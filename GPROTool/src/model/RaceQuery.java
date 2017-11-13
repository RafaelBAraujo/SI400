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
public class RaceQuery {
    
    private Integer season;
    private String rank;
    private Integer rankDivision;
    private Integer raceNumber;
    private String managerUsername;
    private String tyres;
    private String weather;
    private Integer temperature;
    private String track;
    
    private Integer startPosition;
    private Integer finishPosition;
    
    private Integer CTDry;
    private Integer CTWet;
    private Integer overtake;
    private Integer defend;
    private Integer malfunc;
    
    private Pilot pilot;
    private Wear wear;
    
    private String cha;
    private String eng;
    private String fWing;
    private String rWing;
    private String underb;
    private String sidep;
    private String cool;
    private String gear;
    private String bra;
    private String susp;
    private String elec;
    
    public RaceQuery(){
        this.season = null;
        this.rank = "";
        this.rankDivision = null;
        this.raceNumber = null;
        this.managerUsername = "";
        this.tyres = "";
        this.weather = "";
        this.temperature = null;
        this.track = "";
        this.startPosition = null;
        this.finishPosition = null;
        this.CTDry = null;
        this.CTWet = null;
        this.overtake = null;
        this.defend = null;
        this.malfunc = null;
        this.pilot = null;
        this.wear = null;
        this.cha = null;
        this.eng = null;
        this.fWing = null;
        this.rWing = null;
        this.underb = null;
        this.sidep = null;
        this.cool = null;
        this.gear = null;
        this.bra = null;
        this.susp = null;
        this.elec = null;
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

    public Integer getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(Integer raceNumber) {
        this.raceNumber = raceNumber;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    public Integer getFinishPosition() {
        return finishPosition;
    }

    public void setFinishPosition(Integer finishPosition) {
        this.finishPosition = finishPosition;
    }

    public Integer getCTDry() {
        return CTDry;
    }

    public void setCTDry(Integer CTDry) {
        this.CTDry = CTDry;
    }

    public Integer getCTWet() {
        return CTWet;
    }

    public void setCTWet(Integer CTWet) {
        this.CTWet = CTWet;
    }

    public Integer getOvertake() {
        return overtake;
    }

    public void setOvertake(Integer overtake) {
        this.overtake = overtake;
    }

    public Integer getDefend() {
        return defend;
    }

    public void setDefend(Integer defend) {
        this.defend = defend;
    }

    public Integer getMalfunc() {
        return malfunc;
    }

    public void setMalfunc(Integer malfunc) {
        this.malfunc = malfunc;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Wear getWear() {
        return wear;
    }

    public void setWear(Wear wear) {
        this.wear = wear;
    }

    public String getCha() {
        return cha;
    }

    public void setCha(String cha) {
        this.cha = cha;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
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

    public String getUnderb() {
        return underb;
    }

    public void setUnderb(String underb) {
        this.underb = underb;
    }

    public String getSidep() {
        return sidep;
    }

    public void setSidep(String sidep) {
        this.sidep = sidep;
    }

    public String getCool() {
        return cool;
    }

    public void setCool(String cool) {
        this.cool = cool;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getBra() {
        return bra;
    }

    public void setBra(String bra) {
        this.bra = bra;
    }

    public String getSusp() {
        return susp;
    }

    public void setSusp(String susp) {
        this.susp = susp;
    }

    public String getElec() {
        return elec;
    }

    public void setElec(String elec) {
        this.elec = elec;
    }
    
}
