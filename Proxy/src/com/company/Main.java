package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Image> images = new ArrayList<>();
        images.add(new ProxyImage("Netflix_Photo", "Netflix Original"));
        images.add(new ProxyImage("Paramount_Photo", "Paramount Pictures"));
        images.add(new ProxyImage("Lion_King_Photo", "Hakuna Matata"));
        images.add(new ProxyImage("Doctor_Strange_Photo", "Magician"));

        for (Image image : images) {
            System.out.println("\nData of Image:");
            image.showData();

            System.out.println("\nLoading image to be displayed");
            image.displayImage();
        }
    }
}
