package advanced.java.collections.issue24;

import chaos.StupidClass;
import chaos.StupidClassBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_Set {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers); // DEFAULT CAPACITY 16
        System.out.println(uniqueNumbers);

        Set<Integer> uniqueOddNumbers = listNumbers.stream().filter(integer -> integer % 2 != 0).collect(Collectors.toSet());
        System.out.println(uniqueOddNumbers);

        names.add("Tom");
        names.add("Mary");

        if (names.add("Peter")) {
            System.out.println("Peter is added to the set");
        }

        if (!names.add("Tom")) {
            System.out.println("Tom is already added to the set");
        }
        names.add(null);

        if (names.remove("Mary")) {
            System.out.println("Marry is removed");
        }
        if (names.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");

        System.out.printf("The set has %d elements", names.size());

        Iterator<String> iterator = names.iterator();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }


        if (names.contains("Mary")) {
            System.out.println("Found Mary");
        }

        Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));

        if (s1.containsAll(s2)) {
            System.out.println("s2 is a subset of s1");
        }
        System.out.println("s1 before union: " + s1);

        s1.addAll(s2);
        System.out.println("s1 after union: " + s1);

        s1.retainAll(s2);
        System.out.println("INTERSECTION" + s1 + " EQUALS to SUBSET");

        Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> s4 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        s1.addAll(s3);
        s2.addAll(s4);
        System.out.println("s1 before intersection: " + s1);

        s1.retainAll(s2);

        System.out.println("s1 after intersection: " + s1);
       /* Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 8, 9));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 4, 6, 8));

        System.out.println("s1 before union: " + s1);

        s1.addAll(s2);

        System.out.println("s1 after union: " + s1);*/
    }

    private static void someMethSetMeA(StupidClassBuilder builder) {
        builder.setA("a");
    }
    private static void someMethSetMeB(StupidClassBuilder builder) {
        builder.setB("b");
    }

    public boolean tes(List<String> strings){
        return strings.size()==2;

    }
}
