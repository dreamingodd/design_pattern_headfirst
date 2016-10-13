package command.test;

import command.appliance.Door;
import command.appliance.Light;
import command.appliance.Stereo;
import command.command.Command;
import command.command.DoorCloseCommand;
import command.command.DoorOpenCommand;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.command.StereoOffCommand;
import command.command.StereoOnCommand;
import command.control.RemoteControlWithUndo;

/**
 * Ò£¿ØÆ÷²âÊÔ
 * 
 * @author ywd
 *
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		// appliance
		Door door = new Door();
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		// Command
		Command doorOpen = new DoorOpenCommand(door);
		Command doorClose = new DoorCloseCommand(door);
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		Command stereoOn = new StereoOnCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);
		
		// Remote Controller
		RemoteControlWithUndo controller = new RemoteControlWithUndo();
		controller.addOn("doorOpen",doorOpen);
		controller.addOn("doorOpen",doorOpen);
		controller.addOn("lightOn",lightOn);
		controller.addOn("stereoOn",stereoOn);
		controller.addOff("doorClose",doorClose);
		controller.addOff("lightOff",lightOff);
		controller.addOff("stereoOff",stereoOff);
		
		
//		controller.pressOn(RemoteControlWithUndo.ALL_COMMAND);
//		System.out.println("---------------------");
//		controller.pressOff(RemoteControlWithUndo.ALL_COMMAND);
//		System.out.println("---------------------");
		
		controller.pressOn("someCommand");
		System.out.println("---------------------");
		controller.pressOff("stereoOff");
		controller.pressUndo();
	}
}
