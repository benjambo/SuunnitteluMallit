package com.company;

import java.util.Observable;

public class DigitalClock extends Observable {
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        //timer.addObserver(Observable:notifyObservers);
    }

     void draw() {
         int hour = timer.getHour();
         int minute = timer.getMinute();
         int second = timer.getSecond();
         int[] time = {hour, minute, second};

         for (int i : time) {
             setChanged();
             notifyObservers(i);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 System.out.println("Error Occurred.");
             }
         }
     }

    // NOT NEEDED OLD CODE ******************************************************
    /*public void update(Subject subject) {
        if (subject == timer) {
            draw();
        }
    }*/

    //System.out.println("The time is: " + hour + ":" + minute + ":" + second); }
    // NOT NEEDED OLD CODE *******************************************************

}
