package model;

import java.util.ArrayList;
import java.util.List;

class Lap implements java.io.Serializable {

    private static final long serialVersionUID = 3713979261508512938L;

    public String lapNumber;
    public String lapTime;
    public String pos;
    public String tyre;
    public String weather;
    public String temp;
    public String Hum;
    public String events;

    public void printLap() {
        System.out.println(lapNumber);
        System.out.println(lapTime);
        System.out.println(pos);
        System.out.println(tyre);
        System.out.println(weather);
        System.out.println(temp);
        System.out.println(Hum);
        System.out.println(events);
    }

}

public class Race {

    private List<Lap> laps;
    private int season;
    private int raceNumber;
    private String rank;
    private int rankDivision;
    private String moneyEarned;
    private Track track;
    private RaceForecast raceForecast;

    public RaceForecast getRaceForecast() {
        return raceForecast;
    }

    public void setRaceForecast(RaceForecast raceForecast) {
        this.raceForecast = raceForecast;
    }

    Race() {
        laps = new ArrayList<Lap>();
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLap(List<Lap> l) {
        this.laps = l;
    }

    public void printAllLaps() {

        for (int i = 0; i < laps.size(); i++) {
            laps.get(i).printLap();
        }

    }

    public String getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(String moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

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

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}
