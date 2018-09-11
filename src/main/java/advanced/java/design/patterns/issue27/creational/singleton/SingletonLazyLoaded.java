package advanced.java.design.patterns.issue27.creational.singleton;

public class SingletonLazyLoaded {
    private static SingletonLazyLoaded instance = null;
    private SingletonLazyLoaded(){}

    public static SingletonLazyLoaded getInstanceDupa() {
        if (instance == null) {
            instance = new SingletonLazyLoaded();
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
