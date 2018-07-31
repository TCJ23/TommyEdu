package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

public class Inheritance2 {

    public static void main(String args[]) {
        class Animal {
            void walk() {
                System.out.println("I am walking");
            }
        }
        class Bird extends Animal {
            void fly() {
                System.out.println("I am flying");
            }

            void sing() {
                System.out.println("I am singing");
            }

            @Override
            void walk() {
                System.out.println("I can't walk only jump or fly");
            }
        }

        class Dog extends Animal {
            @Override
            void walk() {
                System.out.println("I don't walk Imma DOG I chase");
            }

            void sing() {
                System.out.println("I know birds are singing but I'm barking");
            }
        }
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Animal ptasio = new Bird();
        ((Bird) ptasio).fly();
        ((Bird) ptasio).sing();
        ptasio.walk();
        Animal dog = new Dog();
        dog.walk();
        ((Dog) dog).sing();

    }
}
