package singleton;

public class HungrySingleton {
    private final static HungrySingleton INSTANCE = new  HungrySingleton();

    private HungrySingleton(){
        if(INSTANCE != null){
            throw new RuntimeException("此类为单例模式，已经被实例化了");
        }
    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
