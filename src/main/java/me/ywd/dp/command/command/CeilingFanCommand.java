package command.command;

import command.appliance.CeilingFan;

/**
 * 
 * 风扇有转速，低中高三档。
 * 
 * @author Dreamingodd
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
