package basic.java.flow.control.issue7;

/*https://www.hackerrank.com/challenges/java-if-else/problem*/

import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String result = "";
        if (!(N % 2 == 0)) {
            result = "Weird";
        } else {
            if (N >= 6 && N <= 20){
                result = "Weird";
            }
            else{
                result = "Not Weird";
            }
        }
        System.out.println(result);
    }
}
