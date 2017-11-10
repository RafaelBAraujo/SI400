/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class Pilots implements java.io.Serializable{
    
    private List<Pilot> pilots;

    public Pilot getPilot(String pilotName) {
        Pilot notFound = null;
        for (Pilot pilot : pilots) {
            if (pilot.getName().compareTo(pilotName) == 0) {
                return pilot;
            }
        }
        return notFound;
    }
    
    Pilots() {
        this.pilots = new ArrayList<>();
    }
    
     public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }
    
}

