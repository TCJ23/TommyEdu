package basic.java.data.input.scanner.issue13;

import java.util.Scanner;

/*https://www.hackerrank.com/challenges/java-end-of-file/problem*/
public class EOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int page = 1;
        while (scanner.hasNextLine()) {
            System.out.println(page + " " + scanner.nextLine());
            page++;
        }
        scanner.close();
    }
}
