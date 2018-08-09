package advanced.java.collections.issue24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*     https://www.hackerrank.com/challenges/java-list/problem         */
public class Hacker_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            list.add(l);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String line = scanner.next();
            if (line.equalsIgnoreCase("insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        scanner.close();
        for (Integer integer:
             list) {
            System.out.print(integer + " ");
        }
//        list.forEach(integer -> System.out.println(integer + " "));
    }
}
