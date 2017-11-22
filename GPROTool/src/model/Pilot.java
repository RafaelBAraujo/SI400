package model;

public class Pilot implements java.io.Serializable {

    private static final long serialVersionUID = -4804639357770145458L;

    private String name;
    private int oa;
    private int con;
    private int tal;
    private int agr;
    private int exp;
    private int teI;
    private int sta;
    private int cha;
    private int mot;
    private int rep;
    private int weight;
    private String startEnergy;
    private String endEnergy;
    String[] newPts;
    
    public Pilot(){
        this.newPts = new String[11];
    }

    public String[] getNewPts() {
        return newPts;
    }

    public void setNewPts(String[] newPts) {
        this.newPts = newPts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOa() {
        return oa;
    }

    public void setOa(int oa) {
        this.oa = oa;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getTal() {
        return tal;
    }

    public void setTal(int tal) {
        this.tal = tal;
    }

    public int getAgr() {
        return agr;
    }

    public void setAgr(int agr) {
        this.agr = agr;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getTeI() {
        return teI;
    }

    public void setTeI(int teI) {
        this.teI = teI;
    }

    public int getSta() {
        return sta;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public int getMot() {
        return mot;
    }

    public void setMot(int mot) {
        this.mot = mot;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStartEnergy() {
        return startEnergy;
    }

    public void setStartEnergy(String startEnergy) {
        this.startEnergy = startEnergy;
    }

    public String getEndEnergy() {
        return endEnergy;
    }

    public void setEndEnergy(String endEnergy) {
        this.endEnergy = endEnergy;
    }

}
