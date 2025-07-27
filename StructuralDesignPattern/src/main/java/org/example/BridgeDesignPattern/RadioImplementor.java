package org.example.BridgeDesignPattern;

//Step4: Radio - Concrete Implementor 2
public class RadioImplementor implements Device {

    private boolean on = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        this.on = true;
        System.out.println("Radio is turned ON");
    }

    @Override
    public void turnOff() {
        this.on = false;
        System.out.println("Radio is turned OFF");
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
        System.out.println("Radio volume set to " + percent + "%");
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }
}
