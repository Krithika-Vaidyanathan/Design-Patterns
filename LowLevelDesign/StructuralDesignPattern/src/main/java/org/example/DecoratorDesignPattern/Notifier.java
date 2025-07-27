package org.example.DecoratorDesignPattern;

//Step1: Component Interface - Common interface for both the concrete components and decorators.
public interface Notifier {
    void send(String message);
}
