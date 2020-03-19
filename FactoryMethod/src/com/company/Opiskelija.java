package com.company;

public class Opiskelija extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Maito();
    }
}
