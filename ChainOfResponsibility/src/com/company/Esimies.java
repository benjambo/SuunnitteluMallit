package com.company;

public class Esimies extends Palkankorotus {
    public void processRequest(PalkankorotusPyyntö pyyntö) {
        pyyntö.setNimi("Esimies");
        if (pyyntö.getMäärä() / pyyntö.getPalkka() < BASE) {
            valinta(pyyntö);
        } else {
            oikeudet(pyyntö);
            super.processRequest(pyyntö);
        }
    }
}
