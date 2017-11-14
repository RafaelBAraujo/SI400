package model;

import java.util.ArrayList;
import java.util.List;

public class PitStop implements java.io.Serializable {

    private static final long serialVersionUID = 4908381584223574341L;

    private List<Pit> p;

    PitStop() {
        p = new ArrayList<Pit>();
    }

    public List<Pit> getP() {
        return p;
    }

    public void setP(List<Pit> p) {
        this.p = p;
    }

    public Pit getPit(Integer p){
        return this.p.get(p);
    }
    
    public void printAllPits() {

        for (int i = 0; i < p.size(); i++) {
            p.get(i).printPit();
        }

    }

}
