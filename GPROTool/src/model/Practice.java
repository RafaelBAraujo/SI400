package model;

import java.io.Serializable;

public class Practice implements Serializable {

    private static final long serialVersionUID = -9157624511120058302L;

    private PracticeLap[] l = new PracticeLap[8];
    private int numLaps;

    public Practice() {

        numLaps = 0;

        for (int j = 0; j < 8; j++) {
            l[j] = null;
        }

    }

    public void setId(int id) {

    }

    public int getNumLaps() {
        return numLaps;
    }

    public void setNumLaps(int numLaps) {
        this.numLaps = numLaps;
    }

    public PracticeLap getLap(int n) {

        if (l[n] != null) {
            return l[n];
        } else {
            //System.out.println("nope");
        }

        return null;

    }

    public int setLap(PracticeLap lap, int lapNumber) {

        l[lapNumber] = lap;

        return 1;

    }

    public void printLaps(int numLaps) {

        for (int j = 0; j < numLaps; j++) {

            System.out.print(l[j].getLapTime() + "\t");
            System.out.print(l[j].getDriverMistake() + "\t");
            System.out.print(l[j].getNetTime() + "\t");
            System.out.print(l[j].getfWing() + "\t");
            System.out.print(l[j].getrWing() + "\t");
            System.out.print(l[j].getEngine() + "\t");
            System.out.print(l[j].getBrakes() + "\t");
            System.out.print(l[j].getGear() + "\t");
            System.out.print(l[j].getSusp() + "\t");
            System.out.println(l[j].getTyres());

        }

    }

}
