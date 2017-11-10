package model;

import java.io.Serializable;


public class Car implements Serializable {

    private static final long serialVersionUID = 1444348458147851688L;

    /* ID */
    private int season;
    private int raceNumber;
    private String rank;
    private int rankDivision;
    private String managerName;
    
    private String power;
    private String handling;
    private String acceleration;
  //private String startFuel;
  //private String endFuel;
  //private String tyreSupplier;
  //private String endTyreWear;


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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getRankDivision() {
        return rankDivision;
    }

    public void setRankDivision(int rankDivision) {
        this.rankDivision = rankDivision;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
}
