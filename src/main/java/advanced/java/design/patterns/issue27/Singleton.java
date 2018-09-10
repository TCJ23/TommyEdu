package advanced.java.design.patterns.issue27;

import java.util.Set;

public class Singleton {
    public static void main(String args[]) {

        Runtime singletonRuntime = Runtime.getRuntime();

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(anotherInstance);

        if (singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance");
        }

    }
}
/*
Show
private static Show INSTANCE
private Show()
public static Show getInstance()*/

//LAZY LOADED

  /*  private static Show INSTANCE;
    private Set<String> availableSeats;
    public static Show getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Show();
        }
        return INSTANCE;
    }
*/