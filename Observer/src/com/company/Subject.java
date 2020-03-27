package com.company;

import java.util.Observable;
import java.util.Observer;

public class Subject implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("\nReceived response: " + arg);
    }

    // NOT NEEDED OLD CODE ****************************************
    /*private final List<Observer> observers = new ArrayList<>();

    public void addObserver (Observer o) {
        observers.add(o);
    }

    public void deleteObserver (Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            hasChanged();
        }
    }*/
    // NOT NEEDED OLD CODE ****************************************

}
