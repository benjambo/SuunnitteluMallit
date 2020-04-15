package com.company;

public class Waiter {
    private HamburgerBuilder hamburgerBuilder;

    public void setHamburgerBuilder(HamburgerBuilder hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
    }

    public Object getBurger() {
        return hamburgerBuilder.getBurger();
    }

    public void createBurger() {
        hamburgerBuilder.createNewBurger();
        hamburgerBuilder.buildBun();
        hamburgerBuilder.buildCheese();
        hamburgerBuilder.buildMeat();
        hamburgerBuilder.buildSalad();
    }
}
