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
    
    private int season;
    private String rank;
    private int rankDivision;
    private String managerUsername;
    private Track track;
    private TestingStint[] stints;
    private Weather testingWeather;
    private Weather testingDescription;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
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

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
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
