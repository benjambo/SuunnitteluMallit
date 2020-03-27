package com.company;

import com.company.products.Farkut;
import com.company.products.Kengät;
import com.company.products.Lippis;
import com.company.products.Tpaita;

public interface AbstractVaateFactory {
    public abstract Lippis makeLippis();
    public abstract Tpaita makeTpaita();
    public abstract Farkut makeFarkut();
    public abstract Kengät makeKengät();
}
