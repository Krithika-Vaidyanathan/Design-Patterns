package org.krithika.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

//Concrete subject - Manages list of observers and updates the weather and notifies observers of the change.
public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
