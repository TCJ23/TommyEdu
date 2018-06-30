package strings_Issue_9;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-reverse/problem
public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (A.length() < 50 && isPalindromeCORRECTED(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindromeCORRECTED(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length -1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString().equals(clean));
    }

    private static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
}
