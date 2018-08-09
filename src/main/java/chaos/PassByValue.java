package chaos;

public class PassByValue {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rover");
        myDog.foo(myDog);
        System.out.println(myDog.getName());
    }

}

 class Dog {
    private String name;

    public Dog(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foo(Dog someDog) {
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
    }
}
