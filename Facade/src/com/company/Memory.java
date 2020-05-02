package com.company;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading file from " + position + " with the size of " + data.length + " KB");
    }
}
