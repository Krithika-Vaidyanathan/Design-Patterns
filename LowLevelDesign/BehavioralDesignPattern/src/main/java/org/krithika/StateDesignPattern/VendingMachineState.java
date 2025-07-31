package org.krithika.StateDesignPattern;

//State Interface - defines the contract that all concrete state classes must implement.
//contains a method representing the behavior associated with each state of the vending machine.
public interface VendingMachineState {
    void handleRequest();
}
