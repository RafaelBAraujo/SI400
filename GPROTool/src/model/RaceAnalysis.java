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
public class RaceAnalysis implements java.io.Serializable {
    
    private static final long serialVersionUID = -5159675488447136461L;
    
    private Race race;
    private Practice practice;
    private PitStop pitstop;
    private Strategy strategy;
    private RaceWear raceWear;
    private Car car;
    private Qualifyings qualifyings;
    private Pilot pilot;

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Practice getPractice() {
        return practice;
    }

    public void setPractice(Practice practice) {
        this.practice = practice;
    }

    public PitStop getPitstop() {
        return pitstop;
    }

    public void setPitstop(PitStop pitstop) {
        this.pitstop = pitstop;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public RaceWear getRaceWear() {
        return raceWear;
    }

    public void setRaceWear(RaceWear raceWear) {
        this.raceWear = raceWear;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Qualifyings getQualifyings() {
        return qualifyings;
    }

    public void setQualifyings(Qualifyings qualifyings) {
        this.qualifyings = qualifyings;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    
}
