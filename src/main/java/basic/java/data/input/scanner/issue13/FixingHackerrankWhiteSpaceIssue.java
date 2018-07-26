package basic.java.data.input.scanner.issue13;

import java.util.Scanner;

public class FixingHackerrankWhiteSpaceIssue {

    //https://www.hackerrank.com/challenges/java-stdin-stdout/problem

    /*public class WhiteSpaceIssue {
            public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String whitespace = scan.next();
            String s = scan.nextLine();
            // Write your code here.
            scan.close();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

            */
    /* THIS IS YOUR INPUT NOW a b 2.0 3 4 */
    //
    public static void main(String[] args) {
        System.out.println("Type close to exit");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
//        while (!scan.nextLine().equalsIgnoreCase("close")){
            int i = 0;
            double d = 0;
            String s = null;
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                System.out.println("Int " + i);
            } else if (scan.hasNextDouble()) {
                d = scan.nextDouble();
                System.out.println("Double " + d);
            } else if (scan.hasNext()) {
                s = scan.next();
                System.out.println("String " + s);
                if (s.equalsIgnoreCase("close")) {
                    break;
                }
//            } else if (scan.nextLine().equalsIgnoreCase("close")){
            }
//            scan.close();
        }
    }
}
