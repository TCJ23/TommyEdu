package basic.java.object.and.classes.issue6.before;

public class Animal {
    public String shout() {
        return "Don't	Know!";
    }
}

class Cat extends Animal {
    public String shout() {
        return "Meow	Meow";
    }
}

class Dog extends Animal {
    public String shout() {
        return "BOW	BOW";
    }

    public String run() {
       return "TCJ";
    }
}


