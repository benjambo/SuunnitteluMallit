package com.company;

import java.util.Random;

public class Arvuuttaja {
    // Saadaan pelaajan arvaama numero objektina
    public Object getNumero(Pelaaja pelaaja) {
        return new Memento(pelaaja.getId(), new Random().nextInt(5));
    }

    // Tarkistetaan onko arvaus oikein ja palautetaan vastaus
    public boolean onkoOikein(Object obj, int arvaus) {
        Memento memento = (Memento) obj;

        if (memento.numero == arvaus) {
            System.out.println("Pelaaja " + memento.pelaaja + "! Arvasit oikein, numero oli: " + memento.numero);
            return true;
        }
        System.out.println("Pelaaja " + memento.pelaaja + "! Väärä arvaus, yritä uudelleen!");
        return false;
    }

    // Memento luonti
    private class Memento{
        private int pelaaja;
        private int numero;

        public Memento(int pelaaja, int numero){
            this.pelaaja = pelaaja;
            this.numero = numero;
        }
    }
}
