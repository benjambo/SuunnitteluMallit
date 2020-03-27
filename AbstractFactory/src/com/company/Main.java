package com.company;

import com.company.adidas.AdidasConcreteFactory;
import com.company.boss.BossConcreteFactory;

public class Main {
    public static void main(String[] args) {
        AbstractVaateFactory adidasFactory = new AdidasConcreteFactory();
        AbstractVaateFactory bossFactory = new BossConcreteFactory();

        Jasper jasper = new Jasper();

        System.out.println("Ennen valmistumista:");
        jasper.valitseFactory(adidasFactory);

        System.out.println("****************************************************************************");

        System.out.println("Valmistumisen jälkeen:");
        jasper.valitseFactory(bossFactory);
    }
}

