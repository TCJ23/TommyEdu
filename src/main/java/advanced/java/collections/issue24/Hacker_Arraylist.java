package advanced.java.collections.issue24;

import java.util.ArrayList;
import java.util.Scanner;

/*         https://www.hackerrank.com/challenges/java-arraylist/problem     */
public class Hacker_Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<ArrayList<Object>> listaInput = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Object> rowlist = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                rowlist.add(scanner.nextInt());
            }
            listaInput.add(rowlist);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ArrayList<Object> list = listaInput.get(x - 1);
            if (y <= list.size()) {
                System.out.println(list.get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}


