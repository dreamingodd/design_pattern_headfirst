package command.abc;

import command.appliance.Door;
import command.appliance.Light;
import command.command.Command;
import command.command.DoorOpenCommand;
import command.command.LightOnCommand;

/**
 * Command Pattern Test
 * 
 * @author ywd
 *
 */
public class Test {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Command lightOn = new LightOnCommand(new Light());
		Command doorOpen= new DoorOpenCommand(new Door());
		
		control.setCommand(lightOn);
		control.buttonWasPressed();
		control.setCommand(doorOpen);
		control.buttonWasPressed();
	}
}
