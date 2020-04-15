package com.company;

public class Main {

    public static void main(String[] args) {
        ImageViewer imageViewer = new ImageViewer();

        imageViewer.show("Netflix", "png");
        imageViewer.show("HBO", "jpg");
        imageViewer.show("Movies", "supported?");
    }
}
