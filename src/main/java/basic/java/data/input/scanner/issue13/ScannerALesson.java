package basic.java.data.input.scanner.issue13;

import java.util.Scanner;

public class ScannerALesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        scanner.hasNextLine();
        System.out.println("2");
        scanner.nextLine();
        System.out.println("3");
    }
}
