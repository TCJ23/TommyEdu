package flow_control_Issue_7;

public class StrangeForLoop {
    public static void main(String[] args) {
        for (int a = 10; ; a++) {
            System.out.println(a);
            if (a == 383396) break; // missing brackets {}
        }
    }
}
