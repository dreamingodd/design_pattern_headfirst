package command.command;

import command.appliance.Door;

public class DoorOpenCommand implements Command{
	private Door door;

	public DoorOpenCommand(Door door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
	}

	public void undo() {
		door.close();
	}
}
