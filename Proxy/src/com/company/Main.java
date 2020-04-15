package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Image> images = new ArrayList<>();
        images.add(new ProxyImage("Netflix_Photo"));
        images.add(new ProxyImage("Paramount_Photo"));
        images.add(new ProxyImage("Lion_King_Photo"));
        images.add(new ProxyImage("Doctor_Strange_Photo"));

        System.out.println("Show Image Data:");
        for (Image image : images) {
            image.showData();
        }

        System.out.println("\n****************************");

        System.out.println("\nLoad & Display Images:");
        for (Image image : images) {
            image.displayImage();
        }
    }
}
