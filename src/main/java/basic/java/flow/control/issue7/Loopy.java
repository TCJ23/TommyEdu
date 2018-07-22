package basic.java.flow.control.issue7;

public class Loopy {
    public static void main(String[] args) {
        int[] x = {7, 6, 5, 4, 3, 2, 1};
        for (int y : x) {
            for (int y2 = 0, z2 = 0; z2 < x.length; z2++) {
                y2 = x[z2];
                int y3 = 0;
                for (int z3 = 0; z3 < x.length; z3++) {
                    y3 = x[z3];
                    System.out.println(y3 + " ");
                }
                System.out.println(y2 + " ");
            }
            System.out.println(y + " ");
        }
    }
}