package com.company;

import com.company.adidas.AdidasConcreteFactory;
import com.company.boss.BossConcreteFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractVaateFactory adidasFactory = AdidasConcreteFactory.class.newInstance();
        AbstractVaateFactory bossFactory = BossConcreteFactory.class.newInstance();

        Jasper jasper = new Jasper();

        System.out.println("Ennen valmistumista:");
        jasper.valitseFactory(adidasFactory);

        System.out.println("****************************************************************************");

        System.out.println("Valmistumisen jälkeen:");
        jasper.valitseFactory(bossFactory);
    }
}

