package org.krithika.StateDesignPattern;

//Concrete state - implements behavior associated with its respective state.
public class PaymentPendingState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Payment Pending state: Dispensing product.");
    }
}
