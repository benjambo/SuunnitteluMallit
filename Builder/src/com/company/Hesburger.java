package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hesburger extends HamburgerBuilder{
    private List<String> burger;

    @Override
    public void createNewBurger() {
        this.burger = new ArrayList<>();
        this.burger.add("Hesburger");
    }

    @Override
    public Object getBurger() {
        return this.burger;
    }

    @Override
    public void buildMeat() {
        burger.add("Add Hesburger's Meat");
    }

    @Override
    public void buildSalad() {
        burger.add("Add Hesburger's Salad");
    }

    @Override
    public void buildCheese() {
        burger.add("Add Hesburger's Cheese");
    }

    @Override
    public void buildBun() {
        burger.add("Add Hesburger's Bun");
    }
}
