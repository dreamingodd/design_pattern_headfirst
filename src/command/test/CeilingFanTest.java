package command.test;

import command.appliance.CeilingFan;
import command.command.CeilingFanCommand;
import command.command.Command;
import command.control.RemoteControlWithUndo;

/**
 * 
 * ʹ��״̬ʵ�ֳ�����������ʵ���˶ಿ����(undo)
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
