package chaos;

public class UseAnimals {
    public void doStuff(Animal a) {

        System.out.println("In the Animal version");
    }
    public void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }
    public static void main (String [] args) {
        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        ua.doStuff(animalObj);
        ua.doStuff(horseObj);
        Animal animalRefToHorse = new Horse();
        ua.doStuff(animalRefToHorse);
    }
    /*    overridden version of the
method to call (in other words, from which class in the inheritance tree) is decided
at runtime based on object type, but which overloaded version of the method to call is
based on the reference type of the argument passed at compile time.                      */
}

