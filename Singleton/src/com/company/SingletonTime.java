package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SingletonTime {

    // Static variable
    private static SingletonTime INSTANCE = null;

    // Variable of type LocalDateTime
    public LocalDateTime theTime;

    // Private constructor
    private SingletonTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        theTime = LocalDateTime.now();
    }

    // Static method to create instance of SingletonTime class
    public static SingletonTime getInstance() {
        // To ensure only one instance is created
        if (INSTANCE == null) {
            INSTANCE = new SingletonTime();
        }
        return INSTANCE;
    }
}
