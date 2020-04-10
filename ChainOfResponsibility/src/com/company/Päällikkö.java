package com.company;

public class Päällikkö extends Palkankorotus{
    public void processRequest(PalkankorotusPyyntö pyyntö) {
        double ALLOWABLE = BASE + 0.03;
        pyyntö.setNimi("Yksikön päällikkö");
        if (pyyntö.getMäärä() / pyyntö.getPalkka() > BASE && pyyntö.getMäärä() / pyyntö.getPalkka() < ALLOWABLE) {
            valinta(pyyntö);
        } else {
            oikeudet(pyyntö);
            super.processRequest(pyyntö);
        }
    }
}
