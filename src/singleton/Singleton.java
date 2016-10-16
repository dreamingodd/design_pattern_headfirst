package singleton;

/**
 * ˫�ؼ�����������ͬ����ʹ�á�
 *
 * @author Dreamingodd
 *
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
