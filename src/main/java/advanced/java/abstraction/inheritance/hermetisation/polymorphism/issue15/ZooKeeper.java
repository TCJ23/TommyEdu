package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

class Mammal {
    String name = "furry ";

    String makeNoise() {
        return "generic noise";
    }
}

class Zebra extends Mammal {
    public String name = "stripes ";

    String makeNoise() {
        return "bray";
    }
}

public class ZooKeeper {
    public static void main(String[] args) {
        new ZooKeeper().go();
    }

    void go() {
        Mammal m = new Zebra();
//        Zebra m = new Zebra();   STRIPES !!!!!!!!!!!!!!!!!!
        System.out.println(m.name + m.makeNoise());
    }
}