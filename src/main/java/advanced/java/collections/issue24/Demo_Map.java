package advanced.java.collections.issue24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo_Map {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        String[] stringi = {"Banana", "Orange", "Cherry", "Apple", "Pineapple", "Melon", "Plum", "Banana", "Orange", "Cherry",};
        System.out.println("We will be using such array of strings: ");
        for (String s : stringi
                ) {
            System.out.println(s);
        }
        // Initialize frequency table from command line
        for (String a : stringi) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words: in a MAP");
        System.out.println(m);
        System.out.println();

        Map<String, Integer> tree = new TreeMap<String, Integer>();
        for (String a : stringi) {
            Integer freq = tree.get(a);
            tree.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println("Just by introducing TREEMAP we have alphabetical order: ");
        System.out.println(tree);
        System.out.println();

        Map<String, Integer> linked = new LinkedHashMap<String, Integer>();
        for (String a : stringi) {
            Integer freq = tree.get(a);
            linked.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println("By LINKEDHASMAP we get order of words in which they appear on commandline: ");
        System.out.println(linked);

        for (String key : m.keySet())
            System.out.println(key);
    }
}
