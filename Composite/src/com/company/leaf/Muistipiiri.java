package com.company.leaf;

import com.company.component.Laiteosa;

public class Muistipiiri implements Laiteosa {
    @Override
    public int hinta() {
        return 80;
    }

    @Override
    public void lisää(Laiteosa laiteosa) {
        throw new RuntimeException("Ei voi lisätä laite osaa yksiosaiseen laitteeseen");
    }
}
