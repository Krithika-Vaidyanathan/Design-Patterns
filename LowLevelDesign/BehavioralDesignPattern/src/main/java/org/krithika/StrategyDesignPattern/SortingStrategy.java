package org.krithika.StrategyDesignPattern;

//Strategy Interface - Concrete strategies will implement this strategy interface
//Enables decoupling between the context and the specific strategies.
public interface SortingStrategy {
    void sort(int[] array);
}
