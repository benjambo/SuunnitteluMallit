package com.company;

public abstract class Muoto {
    // Variables for initial stats
    protected  String name;
    protected int hp;
    protected int atk;
    protected int def;

    // Constructor
    public Muoto() {
        this.name = null;
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
