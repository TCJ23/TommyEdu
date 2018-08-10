package advanced.java.collections.issue24;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_SortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> setNumbers = new TreeSet<>();
        setNumbers.addAll(Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 0, 9));
        System.out.println("Sorted Set: " + setNumbers);
        System.out.println("Original Set: " + setNumbers);

        Integer first = setNumbers.first();

        System.out.println("First element: " + first);

        Integer last = setNumbers.last();

        System.out.println("Last element: " + last);

        SortedSet<Integer> subSet = setNumbers.subSet(3, 7);

        System.out.println("Sub Set: " + subSet);

        SortedSet<Integer> headSet = setNumbers.headSet(5);

        System.out.println("Head Set: " + headSet);

        SortedSet<Integer> tailSet = setNumbers.tailSet(5);

        System.out.println("Tail Set: " + tailSet);

        Comparator comparator = setNumbers.comparator();

        System.out.println("Sorted by natural ordering? " + (comparator == null));

        class ZtoAComparator implements Comparator<String> {
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        }

        SortedSet<String> setStrings = new TreeSet<>(new ZtoAComparator());

        setStrings.add("Banana");
        setStrings.add("Apple");
        setStrings.add("Grape");
        setStrings.add("Lemon");
        setStrings.add("Watermelon");

        System.out.println(setStrings);

        Set<String> demo = new HashSet<>(setNumbers.size());
        setNumbers.forEach(integer -> demo.add(integer.toString()));

        System.out.println(demo);
        setStrings.addAll(demo);
        System.out.println(setStrings);

        SortedSet<String> demoTree = new TreeSet<>(demo);
        demoTree.addAll(setStrings);
        System.out.println(demoTree);

        Set<String> stringSet = setNumbers.stream().map(e -> String.valueOf(e)).collect(Collectors.toSet());
    }
}
