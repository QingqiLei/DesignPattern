package singleton;

public enum EnumerationSingleton {
    INSTANCE;

    public EnumerationSingleton getSingleton() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumerationSingleton i = INSTANCE.getSingleton();
        System.out.println(i.ordinal());
        System.out.println(i.toString());
        System.out.println(i.getDeclaringClass());

    }
}
