package basic.java.strings.issue10;

import java.util.Scanner;
import java.util.stream.IntStream;

//https://www.hackerrank.com/challenges/java-string-reverse/problem
//http://www.baeldung.com/java-palindrome
public class PalindromeStream {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (A.length() < 50) {
            if (isPalindromeUsingIntStream(A)) {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindromeUsingIntStream(String text) {
        String temp = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

}
