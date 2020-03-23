package com.company.boss;

import com.company.AbstractVaateFactory;
import com.company.products.Farkut;
import com.company.products.Kengät;
import com.company.products.Lippis;
import com.company.products.Tpaita;

public class BossConcreteFactory implements AbstractVaateFactory {
    @Override
    public Lippis makeLippis() {
        return new BossLippis();
    }

    @Override
    public Tpaita makeTpaita() {
        return new BossTpaita();
    }

    @Override
    public Farkut makeFarkut() {
        return new BossFarkut();
    }

    @Override
    public Kengät makeKengät() {
        return new BossKengät();
    }
}
