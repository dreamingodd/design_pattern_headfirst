package observer.util;

public class LevelUtil {
    public static void printLevel(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
    }

    public static void printLevel(Object arg) {
        int level = (Integer) arg;
        printLevel(level);
    }
}
