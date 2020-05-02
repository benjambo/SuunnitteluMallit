package com.company;

public class Main {

    public static void main(String[] args) {
        Screen screen = new Screen();
        WallButton down = new WallButton(new Down(screen));
        WallButton up = new WallButton(new Up(screen));

        down.click();
        System.out.println(screen);

        up.click();
        System.out.println(screen);
    }
}
