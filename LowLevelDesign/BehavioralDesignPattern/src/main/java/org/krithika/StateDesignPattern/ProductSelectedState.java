package org.krithika.StateDesignPattern;

//Concrete state - implements behavior associated with its respective state.
public class ProductSelectedState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}
