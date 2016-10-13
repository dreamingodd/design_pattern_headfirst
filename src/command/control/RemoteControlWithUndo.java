package command.control;

import java.util.HashMap;
import java.util.Map;

import command.command.Command;
import command.command.NoCommand;


/**
 * 这就是DesignPattern的好处，发现RemoteControl不能实现Undo功能，
 * 也只需要重写他就可以了，这个类就是用来代替的。
 * 
 * HFDP实现的这个Command的undo想到于一个撤销功能，只能undo一步
 * 
 * @author ywd
 *
 */
public class RemoteControlWithUndo {
	
	/**全部*/
	public static final String ALL_COMMAND = "ALL";
	
	// 开
	private Map<String, Command> onCommands;
	// 关
	private Map<String, Command> offCommands;
	// 撤销按钮记忆
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
		// 全开
		if (ALL_COMMAND.equals(name)) {
			for (Command command : onCommands.values()) {
				command.execute();
				undoCommand = command;
			}
		}
		// 开一个
		else if (onCommands.get(name) != null) {
			onCommands.get(name).execute();
			undoCommand = onCommands.get(name);
		}
	}
	
	public void pressOff(String name) {
		// 全关
		if (ALL_COMMAND.equals(name)) {
			for (Command command : offCommands.values()) {
				command.execute();
				undoCommand = command;
			}
		}
		// 关一个
		else if (offCommands.get(name) != null) {
			offCommands.get(name).execute();
			undoCommand = offCommands.get(name);
		}
	}
	
	public void pressUndo() {
		undoCommand.undo();
	}
}
