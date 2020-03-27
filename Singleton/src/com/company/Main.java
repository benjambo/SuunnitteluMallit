package com.company;

import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Variables
        SingletonTime firstTimeStamp = SingletonTime.getInstance();
        // Variable to format date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        System.out.println("The date and time at the moment are: " + dtf.format(firstTimeStamp.theTime));

        // Changing variable of instance
        firstTimeStamp.theTime = firstTimeStamp.theTime.minusYears(54);
        System.out.println("The date and time 54 years ago were: " + dtf.format(firstTimeStamp.theTime));

        firstTimeStamp.theTime = firstTimeStamp.theTime.minusMonths(4);
        System.out.println("The date and time 54 years and 4 months ago were: " + dtf.format(firstTimeStamp.theTime));

        firstTimeStamp.theTime = firstTimeStamp.theTime.minusDays(98);
        System.out.println("The date and time 54 years, 4 months and 98 days ago were: " + dtf.format(firstTimeStamp.theTime));

        firstTimeStamp.theTime = firstTimeStamp.theTime.minusHours(11);
        System.out.println("The date and time 54 years, 4 months, 98 days and 11 hours ago were: " + dtf.format(firstTimeStamp.theTime));
    }
}
