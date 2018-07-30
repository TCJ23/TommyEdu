package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

class Dog {
    public void bark() {
        System.out.println("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.println("Sniff ");
    }

    @Override
    public void bark() {
        System.out.println("howl ");
    }
}

class DogShow {

    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        ((Hound) new Hound()).sniff();

    }

}