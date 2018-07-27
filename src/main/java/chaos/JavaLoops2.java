package chaos;

import java.util.Scanner;

/*           https://www.hackerrank.com/challenges/java-loops/problem  */
public class JavaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j); // NIE POTRZEBNE CASTOWANIE?
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
