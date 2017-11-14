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
public class Pit implements java.io.Serializable {

    private static final long serialVersionUID = 2243720582258432705L;

    public String pitLap;
    public String pitReason;
    public String tyresCond;
    public String fuelLeft;
    public String refill;
    public String pitTime;

    public void printPit() {
        System.out.println(pitLap);
        System.out.println(pitReason);
        System.out.println(tyresCond);
        System.out.println(fuelLeft);
        System.out.println(refill);
        System.out.println(pitTime);
    }

    public String getPitLap() {
        return pitLap;
    }

    public void setPitLap(String pitLap) {
        this.pitLap = pitLap;
    }

    public String getPitReason() {
        return pitReason;
    }

    public void setPitReason(String pitReason) {
        this.pitReason = pitReason;
    }

    public String getTyresCond() {
        return tyresCond;
    }

    public void setTyresCond(String tyresCond) {
        this.tyresCond = tyresCond;
    }

    public String getFuelLeft() {
        return fuelLeft;
    }

    public void setFuelLeft(String fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public String getRefill() {
        return refill;
    }

    public void setRefill(String refill) {
        this.refill = refill;
    }

    public String getPitTime() {
        return pitTime;
    }

    public void setPitTime(String pitTime) {
        this.pitTime = pitTime;
    }

}
