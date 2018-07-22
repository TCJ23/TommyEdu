package basic.java.basic.java.exception.handling.issue12;

public class Gotcha {
    public static void main(String[] args) {

        /*new Gotcha().go();  STACK OVERFLOW*/
       /* try {
            new Gotcha().go();
        } catch (Exception e) {
            System.out.println("ouch");
        }STACK OVEFLOW  */
        try {
            new Gotcha().go();
        } catch (Error e) {
            System.out.println("ouch");
        }
    }

    void go() {
        go();
    }
}
