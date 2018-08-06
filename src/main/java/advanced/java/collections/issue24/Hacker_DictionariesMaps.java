package advanced.java.collections.issue24;

/*           https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem       */

import java.util.HashMap;
import java.util.Scanner;

public class Hacker_DictionariesMaps {

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}
