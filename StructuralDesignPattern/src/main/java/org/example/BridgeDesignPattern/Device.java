package org.example.BridgeDesignPattern;

//Step3: Implementor Interface
public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int percent);
    boolean isEnabled();
}
