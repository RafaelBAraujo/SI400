package model;

public class RaceWear implements java.io.Serializable {

    private static final long serialVersionUID = 1442199415721250299L;

    private Wear startWear;
    private Wear finalWear;

    public Wear getStartWear() {
        return startWear;
    }

    public void setStartWear(Wear startWear) {
        this.startWear = startWear;
    }

    public Wear getFinalWear() {
        return finalWear;
    }

    public void setFinalWear(Wear finalWear) {
        this.finalWear = finalWear;
    }

}
