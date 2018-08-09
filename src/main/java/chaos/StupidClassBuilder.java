package chaos;

public class StupidClassBuilder {
    private  String a;
    private  String b;

    public String getB() {
        return b;
    }

    public String getA() {

        return a;
    }

    public  StupidClassBuilder setA(String a) {
        this.a = a;
        return this;
    }

    public  StupidClassBuilder setB(String b) {
        this.b = b;
        return this;
    }
    public StupidClass build(){
        return new StupidClass(this);
    }
}