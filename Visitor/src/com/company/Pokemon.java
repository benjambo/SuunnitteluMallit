package com.company;

public class Pokemon {
    private Character state;

    public Pokemon (Character state) {
        this.state = state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public void name() {
        this.state.name();
    }

    public void attack() {
        this.state.attack(this);
    }

    public void evolve() {
        this.state.evolve(this);
    }

    public void accept(Visitor visitor) {
        state.accept(visitor);
    }
}
