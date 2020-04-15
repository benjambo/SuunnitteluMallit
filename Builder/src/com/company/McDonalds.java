package com.company;

public class McDonalds extends HamburgerBuilder {
    private StringBuilder burger;

    @Override
    public void createNewBurger() {
        this.burger = new StringBuilder();
        burger.append("McDonald's");
    }

    @Override
    public Object getBurger() {
        return burger;
    }

    @Override
    public void buildMeat() {
        burger.append("Add McDonald's Meat");
    }

    @Override
    public void buildSalad() {
        burger.append("Add McDonald's Salad");
    }

    @Override
    public void buildCheese() {
        burger.append("Add McDonald's Cheese");
    }

    @Override
    public void buildBun() {
        burger.append("Add McDonald's Bun");
    }
}
