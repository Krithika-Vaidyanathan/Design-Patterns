package org.krithika.StrategyDesignPattern;

//Concrete strategy
public class BubbleSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using bubble sort.");
    }
}
