package com.company;

import com.company.characters.Charizard;
import com.company.characters.Charmander;
import com.company.characters.Charmeleon;

public interface Visitor {
    void visit(Charmander charmander);
    void visit(Charmeleon charmeleon);
    void visit(Charizard charizard);
}
