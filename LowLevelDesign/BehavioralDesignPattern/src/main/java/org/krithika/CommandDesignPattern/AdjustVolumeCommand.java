package org.krithika.CommandDesignPattern;

//Step2: Concrete command - encapsulates a specific operation related to devices.
public class AdjustVolumeCommand implements Command {
    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}
