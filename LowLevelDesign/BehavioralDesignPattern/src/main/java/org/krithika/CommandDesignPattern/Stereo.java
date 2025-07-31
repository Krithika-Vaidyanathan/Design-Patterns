package org.krithika.CommandDesignPattern;

//Concrete receiver for a Stereo
public class Stereo implements Device {

    @Override
    public void turnOn() {
        System.out.println("Stereo is now On");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is now Off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}
