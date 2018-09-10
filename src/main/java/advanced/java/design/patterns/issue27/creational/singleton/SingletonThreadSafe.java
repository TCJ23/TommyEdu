package advanced.java.design.patterns.issue27.creational.singleton;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {
        if (instance != null) {
            throw new RuntimeException("Use get instance to create ");
        }
    }

    public static SingletonThreadSafe getInstanceDupa() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {

                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazyLoaded instance = SingletonLazyLoaded.getInstanceDupa();
        System.out.println(instance);
        SingletonLazyLoaded innaInstance = SingletonLazyLoaded.getInstanceDupa();
        System.out.println(innaInstance);

    }
}
