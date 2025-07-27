package org.example.BridgeDesignPattern;

//Step1: Abstraction - contains reference to the Implementor.
//Remote control abstraction doesn't know the details of TV or Radio devices.It just talks to device interface.
//Any new Device can be added without changing remotes.
//Any new Remote type can be added without touching devices.
//BasicRemote+TV, BasicRemote+Radio, AdvancedRemote+TV, AdvancedRemote+Radio.
//All combinations work without creating separate classes like BasicTVRemote, BasicRadioRemote, AdvancedTVRemote, AdvancedRadioRemote,
//Above combinations or classes will lead to class explosion if built separate classes are built.
//If implemented without bridge design patter, if we want to change the BasicRemote class, then we may end up changing BasicTVRemote and BasicRadioRemote.

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void volumeUp();
    public abstract void volumeDown();
}
