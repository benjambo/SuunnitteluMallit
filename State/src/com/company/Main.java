package com.company;

import com.company.muodot.Charmander;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon(new Charmander());
        pokemon.name();

        for(int i = 0; i < 26; i++) {
            pokemon.attack();
        }
        pokemon.name();

        for (int i = 0; i < 50; i++) {
            pokemon.attack();
        }
        pokemon.name();
    }
}
