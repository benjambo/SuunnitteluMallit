package com.company;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        HamburgerBuilder hesburger = new Hesburger();
        HamburgerBuilder mcdonalds = new McDonalds();

        waiter.setHamburgerBuilder(hesburger);
        waiter.createBurger();
        Object hb = waiter.getBurger();
        System.out.println(hb);

        System.out.println("\n*****************************************************************************************");

        waiter.setHamburgerBuilder(mcdonalds);
        waiter.createBurger();
        Object mc = waiter.getBurger();
        System.out.println("\n" + mc);
    }
}
