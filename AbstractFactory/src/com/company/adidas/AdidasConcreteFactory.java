package com.company.adidas;

import com.company.AbstractVaateFactory;
import com.company.products.Farkut;
import com.company.products.Kengät;
import com.company.products.Lippis;
import com.company.products.Tpaita;

public class AdidasConcreteFactory implements AbstractVaateFactory {
    @Override
    public Lippis makeLippis() {
        return new AdidasLippis();
    }

    @Override
    public Tpaita makeTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public Farkut makeFarkut() {
        return new AdidasFarkut();
    }

    @Override
    public Kengät makeKengät() {
        return new AdidasKengät();
    }
}
