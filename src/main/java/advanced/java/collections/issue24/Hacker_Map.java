package advanced.java.collections.issue24;

import java.util.HashMap;
import java.util.Scanner;

/*https://www.hackerrank.com/challenges/phone-book/problem*/
public class Hacker_Map {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            hashMap.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (hashMap.containsKey(s)) {
                System.out.println(s + "=" + hashMap.get(s));
            }
            else System.out.println("Not found");
        }
    }
}
