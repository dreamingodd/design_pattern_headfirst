package command.appliance;

/**
 * 天花板大电扇
 *
 * @author Dreamingodd
 * @2016年10月20日
 */
public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private int state;

    public CeilingFan() {
        state = OFF;
    }

    public void changeState() {
        if (state == HIGH) {
            state = OFF;
            System.out.println("CeilingFan is off...");
        } else {
            state++;
            switch (state) {
            case 1:
                System.out.println("CeilingFan is low...");
                break;
            case 2:
                System.out.println("CeilingFan is medium...");
                break;
            case 3:
                System.out.println("CeilingFan is high...");
                break;
            default:
                break;
            }
        }
    }

    public void stepBack() {
        if (state == OFF) {
            state = HIGH;
            System.out.println("CeilingFan is high...");
        } else {
            state--;
            switch (state) {
            case 0:
                System.out.println("CeilingFan is off...");
                break;
            case 1:
                System.out.println("CeilingFan is low...");
                break;
            case 2:
                System.out.println("CeilingFan is medium...");
                break;
            default:
                break;
            }
        }
    }
}
