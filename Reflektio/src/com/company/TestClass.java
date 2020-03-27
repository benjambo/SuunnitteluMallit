package com.company;

import com.company.adidas.AdidasConcreteFactory;
import com.company.boss.BossConcreteFactory;

public class TestClass {
    AbstractVaateFactory adidasFactory = new AdidasConcreteFactory();
    AbstractVaateFactory bossFactory = new BossConcreteFactory();
    Class c1 = adidasFactory.getClass();
}
