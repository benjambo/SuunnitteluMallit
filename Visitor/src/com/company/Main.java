package com.company;

import com.company.characters.Charizard;
import com.company.characters.Charmander;
import com.company.characters.Charmeleon;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon(new Charmander());
        Character[] list = {new Charmander(), new Charmeleon(), new Charizard()};
        BonusVisitor bonusVisitor = new BonusVisitor();

        // Evolve Pokemon through attacks
        pokemon.name();
        for(int i = 0; i < 7; i++) {
            pokemon.attack();
        }

        System.out.println("******************************");

        // Print bonus points everytime someone visits a specific character
        for (Character character : list) {
            character.accept(bonusVisitor);
        }
        for (Character character : list) {
            character.accept(bonusVisitor);
        }
    }
}
