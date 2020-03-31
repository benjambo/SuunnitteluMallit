package com.company.muodot;

import com.company.Muoto;
import com.company.Pokemon;

public class Charmander extends Muoto {
    private int atk;

    public void name() {
        System.out.println("My name is Charmander!");
    }

    public void attack(Pokemon charmander) {
        System.out.println("Fireball");
        atk++;
        if (atk == 25) {
            evolve(charmander);
        }
    }

    public void evolve(Pokemon charmander) {
        charmander.setState(new Charmeleon());
    }
}
