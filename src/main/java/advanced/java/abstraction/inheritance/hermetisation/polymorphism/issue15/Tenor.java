package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

public class Tenor extends Singer {
    public static String sing() {
        return "fa";
    }

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + ((Tenor) s).sing()); // FA FA
        System.out.println(t.sing() + " " + s.sing()); // LA LA
    }
}

class Singer {
    public static String sing() {
        return "la";
    }
}