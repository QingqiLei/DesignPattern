package singleton;

public class DoubleCheckSingleton {

    private static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
        if(singleton!=null)
            throw new RuntimeException("此类为单例模式，已经被实例化了");
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null)
                    singleton = new DoubleCheckSingleton();

            }
        }

        return singleton;

    }

}
