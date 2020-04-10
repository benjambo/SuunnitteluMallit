package com.company;

public class PalkankorotusPyyntö {
    private double määrä;
    private double palkka;
    private String nimi;

    public PalkankorotusPyyntö(double määrä, double palkka) {
        this.määrä = määrä;
        this.palkka = palkka;
    }

    public double getMäärä() {
        return määrä;
    }

    public void setMäärä(double määrä) {
        this.määrä = määrä;
    }

    public double getPalkka() {
        return palkka;
    }

    public void setPalkka(double palkka) {
        this.palkka = palkka;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
