package com.company.composites;

import com.company.component.Laiteosa;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
    List<Laiteosa> laiteosaLista = new ArrayList<Laiteosa>();
    @Override
    public int hinta() {
        int tuoteHinta = 40;

        // Käydään laiteosalista läpi ja otetaan tarvittavan tuotteen hinta ja lisätään se vanhaan hintaan
        for (Laiteosa lo: laiteosaLista) {
            tuoteHinta += lo.hinta();
        }
        return tuoteHinta;
    }

    @Override
    public void lisää(Laiteosa laiteosa) {
        laiteosaLista.add(laiteosa);
    }
}
