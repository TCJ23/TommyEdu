package basic.java.flow.control.issue7;

public class EndlessLoop {
    public static void main(String[] args) {
        for (int x = 10; x > 5; x++) {
            if (x > 10000000) x = 10;
            break;
        }
    }
}
