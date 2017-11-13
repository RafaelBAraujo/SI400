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
    
    private String season;
    private String rank;
    private String rankDivision;
    private String raceNumber;
    private String managerUsername;
    private String tyres;
    private String weather;
    private String temperature;
    private String track;
    
    private String startPosition;
    private String finishPosition;
    
    private String CTDry;
    private String CTWet;
    private String overtake;
    private String defend;
    private String malfunc;
    
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
        this.season = ".*";
        this.rank = ".*";
        this.rankDivision = ".*";
        this.raceNumber = ".*";
        this.managerUsername = ".*";
        this.tyres = ".*";
        this.weather = ".*";
        this.temperature = ".*";
        this.track = ".*";
        this.startPosition = ".*";
        this.finishPosition = ".*";
        this.CTDry = ".*";
        this.CTWet = ".*";
        this.overtake = ".*";
        this.defend = ".*";
        this.malfunc = ".*";
        this.pilot = null;
        this.wear = null;
        this.cha = ".*";
        this.eng = ".*";
        this.fWing = ".*";
        this.rWing = ".*";
        this.underb = ".*";
        this.sidep = ".*";
        this.cool = ".*";
        this.gear = ".*";
        this.bra = ".*";
        this.susp = ".*";
        this.elec = ".*";
    }

    public boolean isEmpty(){
        
        if(
           this.season.compareTo(".*") == 0 &&
           this.rank.compareTo(".*") == 0 &&
                this.rankDivision.compareTo(".*") == 0 &&
                this.raceNumber.compareTo(".*") == 0 &&
                this.managerUsername.compareTo(".*") == 0 &&
                this.tyres.compareTo(".*") == 0 &&
                this.weather.compareTo(".*") == 0 &&
                this.temperature.compareTo(".*") == 0 &&
                this.track.compareTo(".*") == 0 &&
                this.startPosition.compareTo(".*") == 0 &&
                this.finishPosition.compareTo(".*") == 0 &&
                this.CTDry.compareTo(".*") == 0 &&
                this.CTWet.compareTo(".*") == 0 &&
                this.overtake.compareTo(".*") == 0 &&
                this.defend.compareTo(".*") == 0 &&
                this.malfunc.compareTo(".*") == 0 &&
                this.pilot == null &&
                this.wear == null &&
                this.cha.compareTo(".*") == 0 &&
                this.eng.compareTo(".*") == 0 &&
                this.fWing.compareTo(".*") == 0 &&
                this.rWing.compareTo(".*") == 0 &&
                this.underb.compareTo(".*") == 0 &&
                this.sidep.compareTo(".*") == 0 &&
                this.cool.compareTo(".*") == 0 &&
                this.gear.compareTo(".*") == 0 &&
                this.bra.compareTo(".*") == 0 &&
                this.susp.compareTo(".*") == 0 &&
                this.elec.compareTo(".*") == 0
          ){
            return true;
        }
        else{
            return false;
        }   
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

    public String getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(String raceNumber) {
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

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getFinishPosition() {
        return finishPosition;
    }

    public void setFinishPosition(String finishPosition) {
        this.finishPosition = finishPosition;
    }

    public String getCTDry() {
        return CTDry;
    }

    public void setCTDry(String CTDry) {
        this.CTDry = CTDry;
    }

    public String getCTWet() {
        return CTWet;
    }

    public void setCTWet(String CTWet) {
        this.CTWet = CTWet;
    }

    public String getOvertake() {
        return overtake;
    }

    public void setOvertake(String overtake) {
        this.overtake = overtake;
    }

    public String getDefend() {
        return defend;
    }

    public void setDefend(String defend) {
        this.defend = defend;
    }

    public String getMalfunc() {
        return malfunc;
    }

    public void setMalfunc(String malfunc) {
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
