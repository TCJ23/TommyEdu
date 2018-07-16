package basic.java.object.and.classes.issue6;

class Animal {
    String name;

    public Animal() {
        this.name = "Default	Name";
    }

    //	This	is	called	a	one	argument	constructor.
    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
//p.33 INTERVIEW - JEDNAK SIĘ KOMPILUJE!!!!!!!!!!!!!!