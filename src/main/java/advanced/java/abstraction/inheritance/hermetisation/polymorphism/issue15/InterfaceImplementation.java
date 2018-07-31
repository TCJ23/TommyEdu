package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

import java.time.LocalDateTime;


public interface InterfaceImplementation {
    abstract int calculateMe();
    Integer casting();

    static void calleMeStaticallyWithoutInstantiation(LocalDateTime data, int trwanie) {

        System.out.println("I'm an Interface DON'T INSTANTIATE ME");
    }
}

class Implementacja implements InterfaceImplementation {
    /*@Override
     int calculateMe() {
        return 0;
    }*/

    @Override
    public int calculateMe() {
        System.out.println("I must have public modifier - not WEAKER ACCESS " + 100);
        return 100;
    }

    @Override
    public Integer casting() {
        return Integer.parseInt("100");
    }

    static String calleMeStaticallyWithoutInstantiation(){
        String s = "I AM NOT SAME STATIC METHOD THAT YOU THINK";
        System.out.println(s.toString());
        return s;

    }

    public static void main(String[] args) {
        InterfaceImplementation.calleMeStaticallyWithoutInstantiation(LocalDateTime.now(), 100);
        System.out.println("Dont do : Implementacja imp = new InterfaceImplementaion");
        Implementacja implementacja = new Implementacja();
        calleMeStaticallyWithoutInstantiation();
        implementacja.calculateMe();
        implementacja.casting();
    }
}
