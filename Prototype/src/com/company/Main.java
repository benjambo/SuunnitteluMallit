package com.company;

public class Main {

    public static void main(String[] args) {
        Kello kello = new Kello(20, 45);
        System.out.println("Kello näyttää " + kello.getTunti().getAika() + ":" + kello.getMinuutti().getAika());

        Kello clone = kello.clone();
        clone.getTunti().setAika(22);
        clone.getMinuutti().setAika(15);
        System.out.println("Kloonattu kello näyttää: " + clone.getTunti().getAika() + ":" + clone.getMinuutti().getAika());
    }
}
