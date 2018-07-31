package advanced.java.overriding.vs.overloading.issue22;

import advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15.InterfaceImplementation;

public class OverRidevsOverLoad implements InterfaceImplementation {
    @Override
    public int calculateMe() {
        System.out.println("I must have public modifier - not WEAKER ACCESS " + 100);
        System.out.println("This method has been overriden from interface");
        return 100;

    }

    @Override
    public Integer casting() {
    System.out.println("This method has been overriden from interface");
        return Integer.parseInt("100");
    }

}

class Overload extends OverRidevsOverLoad {
    private Double calclucateMe(Double a, Double b) {
        System.out.println(" I wanted to call me method same as my superclass interface implemented method but to take different arguments");
        return a * b;
    }

    @Override
    public int calculateMe() {
        System.out.println("I actually can use my superclass method with small addition of this text");
        return super.calculateMe();
    }

    public static void main(String[] args) {
        int override = new OverRidevsOverLoad().calculateMe();
        Double overload = new Overload().calclucateMe(2.0, 4.0);
        Overload overloadInstance = new Overload();
        overloadInstance.calculateMe();
    }
}
