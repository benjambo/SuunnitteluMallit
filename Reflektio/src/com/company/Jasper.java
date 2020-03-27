package com.company;

import com.company.products.Farkut;
import com.company.products.Kengät;
import com.company.products.Lippis;
import com.company.products.Tpaita;

public class Jasper {
    public void valitseFactory(AbstractVaateFactory factory) {
        Lippis lippis = factory.makeLippis();
        Tpaita tpaita = factory.makeTpaita();
        Farkut farkut = factory.makeFarkut();
        Kengät kengät = factory.makeKengät();
        System.out.println("Minulla on päällä " + lippis + ", " + tpaita + ", " + farkut + ", " + kengät);
    }
}
