package basic.java.strings.issue10;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
public class PatternSyntaxChecker {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int testCases = scan.nextInt();
            scan.nextLine(); // gets rid of the pesky newline.
            while (testCases-- > 0) {
                String pattern = scan.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (PatternSyntaxException exception) {
                    System.out.println("Invalid");
                }
            }
            scan.close();
        }
    }
