package advanced.java.design.patterns.issue27.behavioral.observer;


public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
