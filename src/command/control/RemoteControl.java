package command.control;

import java.util.ArrayList;
import java.util.List;

import command.command.Command;

/**
 * Ò£¿ØÆ÷
 * Idea from Observer.
 * @author Dreamingodd
 *
 */
public class RemoteControl {
    private List<Command> onCommands = new ArrayList<Command>();
    private List<Command> offCommands = new ArrayList<Command>();

    /* Add and remove command */
    public void addOn(Command command) {
        onCommands.add(command);
    }

    public void removeOn(Command command) {
        onCommands.remove(command);
    }

    public void addOff(Command command) {
        offCommands.add(command);
    }

    public void removeOff(Command command) {
        offCommands.remove(command);
    }

    /**
     * press on
     */
    public void onButtonWasPressed() {
        for (Command command : onCommands) {
            command.execute();
        }
    }

    /**
     * press off
     */
    public void offButtonWasPressed() {
        for (Command command : offCommands) {
            command.execute();
        }
    }
}
