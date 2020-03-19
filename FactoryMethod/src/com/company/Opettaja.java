package com.company;

public class Opettaja extends AterioivaOtus {
    public Juoma createJuoma(){
        return new Vesi();
    }
}