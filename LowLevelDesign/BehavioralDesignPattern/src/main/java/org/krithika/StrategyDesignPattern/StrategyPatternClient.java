package org.krithika.StrategyDesignPattern;

public class StrategyPatternClient {
    public static void main(String[] args) {
        //Create SortingContext with BubbleSortStrategy
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5,2,9,1,5};
        sortingContext.performSort(array1);

        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8,3,7,4,2};
        sortingContext.performSort(array2);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6,1,3,9,5};
        sortingContext.performSort(array3);
    }
}
