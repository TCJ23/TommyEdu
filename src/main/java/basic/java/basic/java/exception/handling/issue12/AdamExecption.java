package basic.java.basic.java.exception.handling.issue12;

public class AdamExecption {
    public static void main(String[] args) {
        try {
            System.out.println(AdamExecption.dividing(2, 0));
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException();
        }
    }

    private static int dividing(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
