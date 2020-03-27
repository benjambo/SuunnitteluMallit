package com.company;

public class Main {
    public static void printInfo(Data d) {
        System.out.println("Permission: " + d.getPermission() + "\nData: " + d.getData());
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Data d = new SimpleData();
        printInfo(d);

        d = new SecretData(d);
        printInfo(d);
    }
}
