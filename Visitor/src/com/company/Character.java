package com.company;

public interface Character {
    public void name();
    public void attack(Pokemon pokemon);
    public void evolve(Pokemon pokemon);
    public int bonus();
    void accept (Visitor visitor);
}
