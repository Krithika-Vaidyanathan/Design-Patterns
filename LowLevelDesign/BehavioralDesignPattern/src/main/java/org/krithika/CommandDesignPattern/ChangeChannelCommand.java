package org.krithika.CommandDesignPattern;

//Step2: Concrete command - encapsulates a specific operation related to devices.
public class ChangeChannelCommand implements Command {

    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.changeChannel();
    }
}
