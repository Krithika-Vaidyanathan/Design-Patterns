package org.krithika.CommandDesignPattern;

//Step2: Concrete command - encapsulates a specific operation related to devices.
public class TurnOnCommand implements Command {

    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.turnOn();
    }
}
