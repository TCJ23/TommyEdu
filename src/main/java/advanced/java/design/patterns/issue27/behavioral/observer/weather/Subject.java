package advanced.java.design.patterns.issue27.behavioral.observer.weather;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
