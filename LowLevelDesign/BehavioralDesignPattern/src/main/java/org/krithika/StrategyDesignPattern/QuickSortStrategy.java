package org.krithika.StrategyDesignPattern;

//Concrete strategy - provides specific algorithm or behavior for performing the task defined by Strategy interface.
//Concrete strategies encapsulate the details of their respective algorithms and provide a method for executing a task.
//They are interchangeable and can be selected and configured by the client based on the requirements of the task.
public class QuickSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using quick sort.");
    }
}
