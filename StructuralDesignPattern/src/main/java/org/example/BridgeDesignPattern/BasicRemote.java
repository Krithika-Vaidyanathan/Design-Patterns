package org.example.BridgeDesignPattern;

//Step2: Refined Abstraction 1
public class BasicRemote extends RemoteControl {

    private int volume = 50;

    public BasicRemote(Device device) {
        super(device);
    }
    @Override
    public void togglePower() {
        if(device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        volume = Math.min(100, volume + 10);
        device.setVolume(volume);
    }

    @Override
    public void volumeDown() {
        volume = Math.max(0, volume - 10);
        device.setVolume(volume);
    }
}
