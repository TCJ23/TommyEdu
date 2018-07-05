package basic.java.basic.java.exception.handling.issue12;

import java.util.InputMismatchException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
public class TryCatch {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
