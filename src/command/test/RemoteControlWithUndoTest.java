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
import command.control.RemoteControl;

/**
 * Ò£¿ØÆ÷²âÊÔ
 * 
 * @author Dreamingodd
 *
 */
public class RemoteControlWithUndoTest {
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
        RemoteControl controller = new RemoteControl();
        controller.addOn(doorOpen);
        controller.addOn(doorOpen);
        controller.addOn(lightOn);
        controller.addOn(stereoOn);
        controller.addOff(doorClose);
        controller.addOff(lightOff);
        controller.addOff(stereoOff);

        // this is interesting, I have to remove twice
        controller.removeOn(doorOpen);
        controller.removeOn(doorOpen);

        controller.onButtonWasPressed();
        System.out.println("---------------------");
        controller.offButtonWasPressed();
    }
}
