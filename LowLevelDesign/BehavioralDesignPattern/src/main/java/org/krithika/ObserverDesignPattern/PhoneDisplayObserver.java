package org.krithika.ObserverDesignPattern;

//Concrete observer - update method is invoked when a weather is updated.
//Concrete subject notifies this concrete observer.
public class PhoneDisplayObserver implements Observer {

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        this.display();
    }

    public void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}