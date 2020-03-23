package com.company;

import com.company.component.Laiteosa;
import com.company.composites.Emolevy;
import com.company.composites.Kotelo;
import com.company.leaf.Muistipiiri;
import com.company.leaf.Näytönohjain;
import com.company.leaf.Prosessori;
import com.company.leaf.Verkkokortti;

public class Main {

    public static void main(String[] args) {
        Laiteosa emolevy = new Emolevy();
        Laiteosa kotelo = new Kotelo();

        Laiteosa muistipiiri = new Muistipiiri();
        Laiteosa näytönohjain = new Näytönohjain();
        Laiteosa prosessori = new Prosessori();
        Laiteosa verkkokortti = new Verkkokortti();

        int lopullinenHinta;

        // Testataan että yksiosaisiin ei voida lisätä tuotteita

        try {
            muistipiiri.lisää(näytönohjain);
            näytönohjain.lisää(muistipiiri);
            prosessori.lisää(verkkokortti);
            verkkokortti.lisää(prosessori);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Lisätään osia ja tulostetaan loppu hinta

        emolevy.lisää(muistipiiri);
        emolevy.lisää(prosessori);
        emolevy.lisää(verkkokortti);

        kotelo.lisää(emolevy);
        kotelo.lisää(näytönohjain);

        lopullinenHinta = kotelo.hinta();
        System.out.println(lopullinenHinta);
    }
}
