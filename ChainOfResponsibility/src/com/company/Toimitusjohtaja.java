package com.company;

public class Toimitusjohtaja extends Palkankorotus {
    public void processRequest(PalkankorotusPyyntö pyyntö) {
        double ALLOWABLE = BASE + 0.05;
        pyyntö.setNimi("Toimitusjohtaja");
        if (pyyntö.getMäärä() / pyyntö.getPalkka() > ALLOWABLE) {
            valinta(pyyntö);
        } else {
            System.out.println(pyyntö.getNimi() + ": En hyväksy palkankroituspyyntäsi.");
        }
    }
}
