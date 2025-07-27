package org.example.DecoratorDesignPattern;

//Step2: Concrete Component - Objects to which we want to add new behavior or responsibilities.
public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
