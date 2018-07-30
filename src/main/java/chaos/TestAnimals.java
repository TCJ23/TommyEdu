package chaos;

public class TestAnimals {
    public static void main (String [] args) {
        Animal a = new Animal();
        Animal b = new Horse(); // Animal ref, but a Horse object
        Animal c = new Horse();
        a.eat(); // Runs the Animal version of eat()
        b.eat(); // Runs the Horse version of eat()
        ((Horse) c).buck();
    }
}
class Animal {
    protected void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
}
class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }

    public void buck() { }
}