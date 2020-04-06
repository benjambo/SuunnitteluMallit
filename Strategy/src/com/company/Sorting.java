package com.company;

public class Sorting {
    private SortingStrategy strategy;
    private int[] numbers;


    public Sorting(SortingStrategy strategy, int[] numbers) {
        this.strategy = strategy;
        this.numbers = numbers;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        this.strategy.sort(this.numbers);
    }
}
