package org.krithika.CommandDesignPattern;

//Client code -
//*The invoker will have the reference to the command object and concrete command classes will have reference to the receiver object.
//| Role                | Description                                                                                                                      |
//| ------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
//| **Command**         | An interface that declares the `execute()` method.                                                                               |
//| **ConcreteCommand** | Implements the `Command` interface and holds a reference to the `Receiver`. It calls the appropriate action on the receiver. |
//| **Receiver**        | The actual business logic class that performs the real work.                                                                     |
//| **Invoker**         | Has a reference to a `Command` object. It triggers the command by calling `execute()`.                                           |
//| **Client**          | Creates the command object, sets the receiver and assigns it to the invoker.                                                     |
public class CommandPatternClient {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now On

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now Off
    }
}
