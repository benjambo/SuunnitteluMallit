package com.company.characters;

import com.company.Character;
import com.company.Pokemon;
import com.company.Visitor;

public class Charmander implements Character {
    private int atk;
    int bonus;

    @Override
    public void name() {
        System.out.println("My name is Charmander!");

    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Fireball");
        atk++;
        if (atk == 2) {
            evolve(pokemon);
        }
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setState(new Charmeleon());
        System.out.println("I'm evolving to Charmeleon");
    }

    @Override
    public int bonus() {
        return bonus;
    }

    @Override
    public void accept(Visitor visitor) {
        this.bonus += 10;
        visitor.visit(this);
    }
}
