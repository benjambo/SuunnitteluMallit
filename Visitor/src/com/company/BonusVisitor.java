package com.company;

import com.company.characters.Charizard;
import com.company.characters.Charmander;
import com.company.characters.Charmeleon;

public class BonusVisitor implements Visitor {
    @Override
    public void visit(Charmander charmander) {
        System.out.println("Charmander bonus points: " + charmander.bonus());
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println("Charmeleon bonus points: " + charmeleon.bonus());
    }

    @Override
    public void visit(Charizard charizard) {
        System.out.println("Charizard bonus points: " + charizard.bonus());
    }
}
