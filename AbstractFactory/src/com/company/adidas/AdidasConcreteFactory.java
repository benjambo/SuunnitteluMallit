package com.company.adidas;

import com.company.AbstractVaateFactory;
import com.company.interfaces.Farkut;
import com.company.interfaces.Kengät;
import com.company.interfaces.Lippis;
import com.company.interfaces.Tpaita;

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
