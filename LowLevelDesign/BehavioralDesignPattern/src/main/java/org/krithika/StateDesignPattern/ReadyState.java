package org.krithika.StateDesignPattern;

//Concrete state - implements behavior associated with its respective state.
public class ReadyState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Ready state: Please select a product");
    }
}
