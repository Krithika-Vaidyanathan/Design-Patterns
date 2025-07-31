package org.krithika.CommandDesignPattern;

//Step2: Concrete command - encapsulates a specific operation related to devices.
public class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
