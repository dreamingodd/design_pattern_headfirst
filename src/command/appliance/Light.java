package command.appliance;

/**
 * Light Class
 * 
 * @author ywd
 *
 */
public class Light {
    // on/off
    private String state;

    /**
     * */
    public void on() {
        state = "on";
        System.out.println("Light is on...");
    }

    /**
     * */
    public void off() {
        state = "off";
        System.out.println("Light is off...");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
