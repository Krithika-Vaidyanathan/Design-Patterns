package org.example.BridgeDesignPattern;

import org.example.AdapterDesignPattern.AdvancedMediaPlayer;

//Step2: AdvancedRemote - Refined Abstraction 2
public class AdvancedRemote extends RemoteControl {

    private int volume = 50;
    public AdvancedRemote(Device device) {
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
        volume = Math.min(100, volume + 5);
        device.setVolume(volume);
    }

    @Override
    public void volumeDown() {
        volume = Math.max(0, volume - 5);
        device.setVolume(volume);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device is muted");
    }
}
