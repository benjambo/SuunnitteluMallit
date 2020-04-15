package com.company.characters;

import com.company.Character;
import com.company.Pokemon;
import com.company.Visitor;

public class Charizard implements Character {
    private int atk;
    int bonus;

    @Override
    public void name() {
        System.out.println("My name is Charizard and I'm the final form!");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Dragon Claw");
        atk++;
        if (atk == 6) {
            evolve(pokemon);
        }
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("I'm fully evolved");
    }

    @Override
    public int bonus() {
        return bonus;
    }

    @Override
    public void accept(Visitor visitor) {
        this.bonus += 40;
        visitor.visit(this);
    }
}
