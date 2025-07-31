package org.krithika.CommandDesignPattern;

//Invoker class - holds a reference to a command object and triggers its execution through execute() method.
//The invoker doesn't know the specific details of the command or the devices.

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
