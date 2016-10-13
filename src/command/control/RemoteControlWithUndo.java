package command.control;

import java.util.HashMap;
import java.util.Map;

import command.command.Command;
import command.command.NoCommand;


/**
 * �����DesignPattern�ĺô�������RemoteControl����ʵ��Undo���ܣ�
 * Ҳֻ��Ҫ��д���Ϳ����ˣ�����������������ġ�
 * 
 * HFDPʵ�ֵ����Command��undo�뵽��һ���������ܣ�ֻ��undoһ��
 * 
 * @author ywd
 *
 */
public class RemoteControlWithUndo {
	
	/**ȫ��*/
	public static final String ALL_COMMAND = "ALL";
	
	// ��
	private Map<String, Command> onCommands;
	// ��
	private Map<String, Command> offCommands;
	// ������ť����
	private Command undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new HashMap<String, Command>();
		offCommands = new HashMap<String, Command>();
		undoCommand = new NoCommand();
	}
	
	public void addOn(String name, Command command){
		onCommands.put(name, command);
	}
	
	public void addOff(String name, Command command){
		offCommands.put(name, command);
	}
	
	public void removeOn(String name) {
		onCommands.remove(name);
	}
	
	public void removeOff(String name) {
		offCommands.remove(name);
	}
	
	public void pressOn(String name) {
		// ȫ��
		if (ALL_COMMAND.equals(name)) {
			for (Command command : onCommands.values()) {
				command.execute();
				undoCommand = command;
			}
		}
		// ��һ��
		else if (onCommands.get(name) != null) {
			onCommands.get(name).execute();
			undoCommand = onCommands.get(name);
		}
	}
	
	public void pressOff(String name) {
		// ȫ��
		if (ALL_COMMAND.equals(name)) {
			for (Command command : offCommands.values()) {
				command.execute();
				undoCommand = command;
			}
		}
		// ��һ��
		else if (offCommands.get(name) != null) {
			offCommands.get(name).execute();
			undoCommand = offCommands.get(name);
		}
	}
	
	public void pressUndo() {
		undoCommand.undo();
	}
}
