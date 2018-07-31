package basic.java.strings.issue10;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class StringIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        if (A.compareToIgnoreCase(B) < 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    //        System.out.println(A.compareTo(B)>0?"Yes":"No");
    // Failed test case for equal = java = java
        System.out.println(A.trim().substring(0, 1).toUpperCase()
                +A.trim().substring(1, A.length())
                +" "+
                B.trim().substring(0, 1).toUpperCase()
                +B.substring(1, B.length()));
    }
}