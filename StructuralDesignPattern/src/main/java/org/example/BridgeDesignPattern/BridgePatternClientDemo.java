package org.example.BridgeDesignPattern;

//Bridge design pattern decouples abstraction from its implementation so they can evolve independently.
//Think of it like a remote control (abstraction) controlling different types of devices(Implementations) without being tightly bound.

public class BridgePatternClientDemo {
    public static void main(String[] args) {
        System.out.println("Using Basic remote on TV");
        Device tv = new TVImplementor();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.volumeDown();

        System.out.println("Using Advanced remote on Radio");
        Device radio = new TVImplementor();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.volumeDown();
        advancedRemote.mute();
    }
}
