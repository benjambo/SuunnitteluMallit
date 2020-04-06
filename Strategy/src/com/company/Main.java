package com.company;

import java.util.Random;

public class Main {

    final static int MAX=50000;

    public static void main(String[] args) {
        int[] bubbleArray = new int[MAX];
        int[] insertionArray = new int[MAX];
        int[] selectionArray = new int[MAX];

        Random random = new Random();

        System.out.println("Randomly Generated Numbers: ");
        for (int i = 0; i < MAX; i++) {
            bubbleArray[i] = random.nextInt(50000);
            insertionArray[i]= bubbleArray[i];
            selectionArray[i]= bubbleArray[i];
            System.out.print(bubbleArray[i]+", ");

            if (i > 0 && i % 40 == 0)
            System.out.println();
        }

        Sorting bubbleSorting = new Sorting(new BubbleSorting(), bubbleArray);
        Sorting insertionSorting = new Sorting(new InsertionSorting(), selectionArray);
        Sorting selectionSorting = new Sorting(new SelectionSorting(), insertionArray);

        //***********************************************************************************

        System.out.println("\n\nBubble Sorting");
        long startTime = System.currentTimeMillis();
        bubbleSorting.sort();
        long totalTime = System.currentTimeMillis()-startTime;
        printNumbers(bubbleArray);
        System.out.println("Total Time for Bubble Sorting: "+ totalTime);

        //***********************************************************************************

        System.out.println("\nInsertion Sorting");
        startTime = System.currentTimeMillis();
        insertionSorting.sort();
        totalTime = System.currentTimeMillis()-startTime;
        printNumbers(selectionArray);
        System.out.println("Total Time for Insertion Sorting: "+ totalTime);

        //***********************************************************************************

        System.out.println("\nSelection Sorting");
        startTime = System.currentTimeMillis();
        selectionSorting.sort();
        totalTime = System.currentTimeMillis()-startTime;
        printNumbers(insertionArray);
        System.out.println("Total Time for Selection Sorting: "+ totalTime);

        //***********************************************************************************
    }

    private static void printNumbers(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
            if (i>0 && i%40==0)
                System.out.println();
        }
        System.out.println("\n");
    }

}
