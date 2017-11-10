package model;

public class Wear implements java.io.Serializable {

    private static final long serialVersionUID = -7232287696220627796L;

    private String Cha;
    private String Eng;
    private String fWing;
    private String rWing;
    private String Underb;
    private String Sidep;
    private String Cool;
    private String Gear;
    private String Bra;
    private String Susp;
    private String Elec;

    public String getCha() {
        return Cha;
    }

    public void setCha(String cha) {
        Cha = cha;
    }

    public String getEng() {
        return Eng;
    }

    public void setEng(String eng) {
        Eng = eng;
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
        return Underb;
    }

    public void setUnderb(String underb) {
        Underb = underb;
    }

    public String getSidep() {
        return Sidep;
    }

    public void setSidep(String sidep) {
        Sidep = sidep;
    }

    public String getCool() {
        return Cool;
    }

    public void setCool(String cool) {
        Cool = cool;
    }

    public String getGear() {
        return Gear;
    }

    public void setGear(String gear) {
        Gear = gear;
    }

    public String getBra() {
        return Bra;
    }

    public void setBra(String bra) {
        Bra = bra;
    }

    public String getSusp() {
        return Susp;
    }

    public void setSusp(String susp) {
        Susp = susp;
    }

    public String getElec() {
        return Elec;
    }

    public void setElec(String elec) {
        Elec = elec;
    }

    public void printAll() {
        System.out.println(this.Cha);
        System.out.println(this.Eng);
        System.out.println(this.fWing);
        System.out.println(this.rWing);
        System.out.println(this.Underb);
        System.out.println(this.Sidep);
        System.out.println(this.Cool);
        System.out.println(this.Gear);
        System.out.println(this.Bra);
        System.out.println(this.Susp);
        System.out.println(this.Elec);
    }

}
