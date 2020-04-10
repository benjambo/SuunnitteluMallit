package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Pelaaja implements Runnable{
    private int id;
    private Object obj;
    private Arvuuttaja arvuuttaja;
    ArrayList<Integer> numero;


    public Pelaaja(int id, Arvuuttaja arvuuttaja) {
        this.id = id;
        this.arvuuttaja = arvuuttaja;
        this.numero = new ArrayList<>();
    }

    // Liitetän pelaaja peliin ja palautetaan tämän arvaus
    public void liityPeliin() {
        this.obj = arvuuttaja.getNumero(this);
    }

    public int getId() {
        return id;
    }


    // Arvauksen toimenpiteet
    public void arvaa() {
        int arvaus = new Random().nextInt(5);

        if (!numero.contains(arvaus)) {
            numero.add(arvaus);
            System.out.println("Arvaukseni on: " + arvaus);
            if (!arvuuttaja.onkoOikein(obj, arvaus)) {
                arvaa();
            }
        }
        else {
            arvaa();
        }
    }

    @Override
    public void run() {
        liityPeliin();
        arvaa();

    }
}
