package basic.java.basic.java.exception.handling.issue12;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
public class StringtoInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String S = in.next();
            int i = Integer.parseInt(S);
            System.out.println(i);
        }
        catch (Exception e){
            System.out.println("Bad String");
        }
        finally {
            in.close();
        }
    }
}
