package command.command;

import command.appliance.Light;

/**
 * Light command implementation
 * 
 * @author ywd
 *
 */
public class LightOnCommand implements Command{
	Light light;
	public LightOnCommand(Light light){
		this.light = light;
	}
	public void execute() {
		light.on();
	}
	public void undo() {
		light.off();
	}
}
