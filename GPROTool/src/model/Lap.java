/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author r176066
 */
public class Lap implements java.io.Serializable {

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
