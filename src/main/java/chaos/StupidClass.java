package chaos;

public class StupidClass {

    private final String a;
    private final String b;

    StupidClass(StupidClassBuilder builder) {

        this.a = builder.getA();
        this.b = builder.getB();
    }


}
