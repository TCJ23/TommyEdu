package basic.java.flow.control.issue7;

public class StrangeForLoop {
    public static void main(String[] args) {
        for (int a = 10; ; a++) {
            if (a == 20) break; // missing brackets {}
            if (a == 15) {
                System.out.println("missing 15");
                continue;
            }
            System.out.println(a);
        }
    }
}
