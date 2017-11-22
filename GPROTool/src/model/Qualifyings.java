package model;

public class Qualifyings implements java.io.Serializable {

    private static final long serialVersionUID = 1172863791926489777L;

    private Qualifying Q1;
    private Qualifying Q2;

    public Qualifying getQ1() {
        return Q1;
    }

    public void setQ1(Qualifying q1) {
        Q1 = q1;
    }

    public Qualifying getQ2() {
        return Q2;
    }

    public void setQ2(Qualifying q2) {
        Q2 = q2;
    }

}
