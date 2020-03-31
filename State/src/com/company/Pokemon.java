package com.company;

public class Pokemon {
    private Muoto state;

    public Pokemon (Muoto state) {
        this.state = state;
    }

    public void setState(Muoto state) {
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
}
