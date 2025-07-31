package org.krithika.StrategyDesignPattern;

//Concrete strategy
public class MergeSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using merge sort.");
    }
}
