package com.company;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        HamburgerBuilder hesburger = new Hesburger();
        HamburgerBuilder mcdonalds = new McDonalds();

        waiter.setHamburgerBuilder(hesburger);
        waiter.createBurger();
        System.out.println(waiter.getBurger());

        System.out.println("\n*****************************************************************************************");

        waiter.setHamburgerBuilder(mcdonalds);
        waiter.createBurger();
        System.out.println("\n" + waiter.getBurger());
    }
}
