package org.krithika.ObserverDesignPattern;

//Subject interface
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
