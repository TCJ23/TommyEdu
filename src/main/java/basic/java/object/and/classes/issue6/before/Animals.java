package basic.java.object.and.classes.issue6.before;

public class Animals {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1.shout());

        Dog dog = new Dog();
        System.out.println(dog.shout());
        dog.run();

        System.out.println(dog.run());
    }
}
