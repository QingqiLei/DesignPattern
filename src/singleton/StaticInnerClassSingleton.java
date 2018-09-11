package singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    private static class SingletonInstance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
