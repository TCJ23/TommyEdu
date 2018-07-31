package basic.java.strings.issue10;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout/problem

public class WhiteSpaceIssue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
//        a b 3 4
        double d = scan.nextDouble();
        String whitespace = scan.next();
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

       /* while(scan.hasNextInt()){
            int i = scan.nextInt();
            System.out.println("Int " + i );
        }*/
    }
}
