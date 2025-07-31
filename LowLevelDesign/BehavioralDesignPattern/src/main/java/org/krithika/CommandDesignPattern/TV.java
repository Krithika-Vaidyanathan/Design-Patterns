package org.krithika.CommandDesignPattern;

//Concrete receiver for a TV
public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV is now On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now Off");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}
