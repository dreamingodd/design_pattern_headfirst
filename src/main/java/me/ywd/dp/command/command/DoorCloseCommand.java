package command.command;

import command.appliance.Door;

public class DoorCloseCommand implements Command {

    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    public void undo() {
        door.open();
    }
}
