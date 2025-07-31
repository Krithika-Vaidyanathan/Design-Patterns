package org.krithika.StateDesignPattern;
//Allows an object to alter its behavior when its internal state changes.
//This pattern is useful when an object's behavior depends on its state, and the state can change during the object's lifecycle.
//This pattern focuses on managing state transitions and coordinating state-specific behaviors.
public class StatePatternClient {
    public static void main(String[] args) {
        VendingMachineContext context = new VendingMachineContext();

        context.setState(new ReadyState());  //set initial state
        context.request();  //request change state

        context.setState(new ProductSelectedState());
        context.request();

        context.setState(new PaymentPendingState());
        context.request();

        context.setState(new OutOfStockState());
        context.request();
    }
}
