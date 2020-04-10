package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Esimies esimies = new Esimies();
        Päällikkö päällikkö = new Päällikkö();
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();

        esimies.setSuccessor(päällikkö);
        päällikkö.setSuccessor(toimitusjohtaja);

        try {
            while (true) {
                System.out.println("Syötä palkankoroituspyyntösi euroina:");
                System.out.print("Pyyntö:");
                double koroitusMäärä = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

                System.out.println("Syötä tämän hetkinen palkkasi määrä:");
                System.out.print("Palkka:");
                double tämänHetkinenPalkka = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

                esimies.processRequest(new PalkankorotusPyyntö(koroitusMäärä, tämänHetkinenPalkka));
            }
        } catch (Exception e){
            System.exit(1);
        }
    }
}
