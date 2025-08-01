package org.krithika.StateDesignPattern;

//Concrete state - implements behavior associated with its respective state.
public class OutOfStockState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Out of stock state: Product unavailable. Please select another product.");
    }
}
