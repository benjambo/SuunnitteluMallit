package com.company.muodot;

import com.company.Muoto;
import com.company.Pokemon;

public class Charmeleon extends Muoto {
    private int atk;

    public void name() {
        System.out.println("My name is Charmeleon!");
    }

    public void attack(Pokemon charmeleon) {
        System.out.println("Fire Boulder");
        atk++;
        if (atk == 50) {
            evolve(charmeleon);
        }
    }

    public void evolve(Pokemon charmeleon) {
        charmeleon.setState(new Charizard());
    }
}
