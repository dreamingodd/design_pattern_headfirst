package command.test;

import command.appliance.CeilingFan;
import command.command.CeilingFanCommand;
import command.command.Command;
import command.control.RemoteControlWithUndo;

/**
 * 
 * 使用状态实现撤销，无意中实现了多部撤销(undo)
 * 
 * @author ywd
 *
 */
public class CeilingFanTest {
	public static void main(String[] args) {
		CeilingFan cf = new CeilingFan();
		Command cfCommand = new CeilingFanCommand(cf);
		
		RemoteControlWithUndo controller = new RemoteControlWithUndo();
		
		controller.addOn("cf", cfCommand);
		
		controller.pressOn("cf");
		controller.pressOn("cf");
		controller.pressOn("cf");
		controller.pressOn("cf");
		controller.pressUndo();
		controller.pressUndo();
		controller.pressUndo();
		controller.pressUndo();
	}
}
