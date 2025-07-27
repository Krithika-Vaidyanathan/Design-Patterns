package org.example.BridgeDesignPattern;

//Step4: TV - Concrete Implementor 1
public class TVImplementor implements Device {
    private boolean on = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        this.on = true;
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        this.on = false;
        System.out.println("TV is turned OFF");
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("TV volume set to " + percent + "%");
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }
}
