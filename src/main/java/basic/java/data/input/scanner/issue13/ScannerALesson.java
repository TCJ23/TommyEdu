package basic.java.data.input.scanner.issue13;

import java.util.Scanner;

public class ScannerALesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        scanner.hasNextLine();
        System.out.println("2");
        String s = scanner.nextLine();
        System.out.println(s);
        System.out.println("3");
        scanner.hasNextLine();
        String s1 = scanner.nextLine();
        System.out.println(s1);
    }
}
