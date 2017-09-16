package command.appliance;

public class Stereo {
    private String state;
    private int volume;

    public void on() {
        state = "on";
        System.out.println("Stereo is " + state + "...");
    }

    public void off() {
        state = "off";
        System.out.println("Stereo is " + state + "...");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo's volume is " + this.volume + " now...");
    }
}
