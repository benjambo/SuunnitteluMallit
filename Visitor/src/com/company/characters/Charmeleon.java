package com.company.characters;

import com.company.Character;
import com.company.Pokemon;
import com.company.Visitor;

public class Charmeleon implements Character {
    private int atk;
    int bonus;

    @Override
    public void name() {
        System.out.println("My name is Charmeleon!");
    }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println("Flamethrower");
        atk++;
        if (atk == 4) {
            evolve(pokemon);
        }
    }

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setState(new Charizard());
        System.out.println("I'm evolving to Charizard");
    }

    @Override
    public int bonus() {
        return bonus;
    }

    @Override
    public void accept(Visitor visitor) {
        this.bonus += 20;
        visitor.visit(this);
    }
}
