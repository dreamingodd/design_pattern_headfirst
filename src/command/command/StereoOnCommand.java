package command.command;

import command.appliance.Stereo;

public class StereoOnCommand implements Command{

	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setVolume(11);
	}


	public void undo() {
		stereo.off();
	}
}
