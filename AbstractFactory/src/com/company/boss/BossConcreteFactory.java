package com.company.boss;

import com.company.AbstractVaateFactory;
import com.company.interfaces.Farkut;
import com.company.interfaces.Kengät;
import com.company.interfaces.Lippis;
import com.company.interfaces.Tpaita;

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
