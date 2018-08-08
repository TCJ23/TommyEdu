package advanced.java.constructors.issue21;

abstract class ConstructMe {
    public ConstructMe() {
        System.out.println("Abstract");
    }
}
/* nadrzedny super i jakiś dodatkowy za pomocą super parametry*/
class Parent extends ConstructMe {
    public Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int a = 5;
    String name;

    public Child(int a, String name) {
        this.a = a;
        this.name = name;
        System.out.println("Paramenter constructor");
    }

    public Child() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child dziecko = new Child(2, "dziecko");
    }
}



