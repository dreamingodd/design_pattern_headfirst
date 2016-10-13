package command.command;

import command.appliance.CeilingFan;

/**
 * 
 * 
 * 
 * @author ywd
 *
 */
public class CeilingFanCommand implements Command {

	private CeilingFan ceilingFan;
	
	public CeilingFanCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.changeState();
	}

	@Override
	public void undo() {
		ceilingFan.stepBack();
	}

}
