package com.company;

public class Main {

    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock dg = new DigitalClock(timer);
        Subject s = new Subject();
        dg.addObserver(s);
        dg.draw();

        // NOT NEEDED OLD CODE ***************************************
        /*DigitalClock digitalClock = new DigitalClock(timer);
        System.out.println(digitalClock);*/

        /*Subject subject = new Subject();
        subject.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("\nRecieved response: " + arg);
            }
        });*/
        // NOT NEEDED OLD CODE ****************************************
    }
}
