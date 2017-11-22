package model;

public class Setup implements java.io.Serializable {

    private static final long serialVersionUID = -4770807149651715834L;

    String FWing;
    String RWing;
    String Eng;
    String Bra;
    String Gear;
    String Susp;
    String Tyres;

    public void printAll() {

        System.out.println(this.FWing);
        System.out.println(this.RWing);
        System.out.println(this.Eng);
        System.out.println(this.Bra);
        System.out.println(this.Gear);
        System.out.println(this.Susp);
        System.out.println(this.Tyres);

    }

    public String getFWing() {
        return FWing;
    }

    public void setFWing(String FWing) {
        this.FWing = FWing;
    }

    public String getRWing() {
        return RWing;
    }

    public void setRWing(String RWing) {
        this.RWing = RWing;
    }

    public String getEng() {
        return Eng;
    }

    public void setEng(String Eng) {
        this.Eng = Eng;
    }

    public String getBra() {
        return Bra;
    }

    public void setBra(String Bra) {
        this.Bra = Bra;
    }

    public String getGear() {
        return Gear;
    }

    public void setGear(String Gear) {
        this.Gear = Gear;
    }

    public String getSusp() {
        return Susp;
    }

    public void setSusp(String Susp) {
        this.Susp = Susp;
    }

    public String getTyres() {
        return Tyres;
    }

    public void setTyres(String Tyres) {
        this.Tyres = Tyres;
    }

}
