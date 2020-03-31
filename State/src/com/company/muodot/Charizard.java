package com.company.muodot;

import com.company.Muoto;
import com.company.Pokemon;

public class Charizard  extends Muoto {
    private int atk;

    public void name() {
        System.out.println("My name is Charizard and I'm the final form!");
    }

    public void attack(Pokemon charmander) {
        System.out.println("Fire Dragon");
        atk++;
        if (atk == 100) {
            System.out.println("YOU ARE FIRE!!!");
        }
    }
}
