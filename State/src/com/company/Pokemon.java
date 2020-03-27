package com.company;

import com.company.muodot.Charizard;
import com.company.muodot.Charmander;
import com.company.muodot.Charmeleon;

public class Pokemon {
    private Muoto charmander, charmeleon, charizard, currentLvl;

    public Pokemon() {
        charmander = new Charmander();
        charmeleon = new Charmeleon();
        charizard = new Charizard();
        currentLvl = charmander;
    }

    // To evolve
    public void evolve(Muoto muoto) {
        this.currentLvl = muoto;
    }

    public void printStats() {
        System.out.println(currentLvl.name + ":\tHealth: " + currentLvl.getHp() + "\tAttack: " +
                currentLvl.getAtk() + "\tDefense: " + currentLvl.getDef());
    }

    public Muoto getCharmander() { return this.charmander; }
    public Muoto getCharmeleon() { return this.charmeleon; }
    public Muoto getCharizard() { return this.charizard; }
}
