package org.krithika.StateDesignPattern;

//Context class - responsible for maintaining the current state of the vending machine and delegating
//state-specific behavior to the appropriate state object.
public class VendingMachineContext {
    private VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
