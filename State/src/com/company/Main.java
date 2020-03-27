package com.company;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        // Default level (Charmander)
        pokemon.printStats();

        // Evolving to Charmeleon
        pokemon.evolve(pokemon.getCharmeleon());
        pokemon.printStats();

        // Evolving to Charizard
        pokemon.evolve(pokemon.getCharizard());
        pokemon.printStats();
    }
}
