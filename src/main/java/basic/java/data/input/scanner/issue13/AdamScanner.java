package basic.java.data.input.scanner.issue13;

import java.util.Scanner;

public class AdamScanner {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę całkowitą: ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz:");
        }

        int number = scan.nextInt();
        System.out.println("Podałeś liczbę: " + number);
    }
}