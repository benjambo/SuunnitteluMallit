package com.company;

public class Main {

    public static void main(String[] args) {
        // Luodaan arvuuttaja
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        // Luodaan pelaajat
        Pelaaja pelaaja1 = new Pelaaja(1, arvuuttaja);
        Pelaaja pelaaja2 = new Pelaaja(2, arvuuttaja);
        Pelaaja pelaaja3 = new Pelaaja(3, arvuuttaja);

        // Laitetaan Pelaajat arvaamaan
        pelaaja1.run();
        pelaaja2.run();
        pelaaja3.run();
    }
}
