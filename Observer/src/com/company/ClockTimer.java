package com.company;

import java.time.LocalDateTime;

public class ClockTimer extends Subject {
    public int getHour() {
        return LocalDateTime.now().getHour();
    }
    public int getMinute() {
        return LocalDateTime.now().getMinute();
    }
    public int getSecond() {
        return LocalDateTime.now().getSecond();
    }

    // NOT NEEDED OLD CODE *******************************
    /*void tick() {
        notifyObservers();
    }*/
    // NOT NEEDED OLD CODE *******************************
}
