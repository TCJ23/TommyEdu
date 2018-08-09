package advanced.java.collections.issue24;

import java.util.*;

public class Demo_Collections {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>(1000); //DEFAULT CAPACITY 10!
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");
        listStrings.add("D");
        listStrings.add("C");
        listStrings.add("E");
        listStrings.add("A");
        listStrings.add("B");
        System.out.println("listStrings before sorting: " + listStrings);
        Collections.sort(listStrings);
        System.out.println("listStrings after sorting: " + listStrings);

        List<Number> linkedNumbers = new LinkedList<>(); //SUBTYPES ARE FINE!
        linkedNumbers.add(new Integer(123));
        linkedNumbers.add(new Float(3.1415));
        linkedNumbers.add(new Double(299.988));
        linkedNumbers.add(new Long(67000));
        System.out.println(linkedNumbers);

        String element = listStrings.get(1);
        Number number = linkedNumbers.get(3);
        System.out.println(element);
        System.out.println(number);

        listStrings.set(2, "ZMIANA");

        System.out.println(listStrings.get(2));
        if (listStrings.contains("Hello")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        int firstIndex = linkedNumbers.indexOf(1234);
        int lastIndex = listStrings.indexOf("Hello");
        List<String> listStrings2 = new LinkedList<String>();
        listStrings.add("Five");
        listStrings.add("Six");
        listStrings.add("Seven");
        listStrings.add("Eight");
        System.out.println("Linked list" + (listStrings2));

        List<String> sourceList = new ArrayList<String>();
        sourceList.add("A");
        sourceList.add("B");
        sourceList.add("C");
        sourceList.add("D");
        List<String> destList = new ArrayList<String>();
        destList.add("V");
        destList.add("W");
        destList.add("X");
        destList.add("Y");
        destList.add("Z");
        System.out.println("destList before copy: " + destList);
        Collections.copy(destList, sourceList);
        System.out.println("destList after copy: " + destList);

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) numbers.add(i);
        System.out.println("List before shuffling: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("List after shuffling: " + numbers);

        List<Integer> numbers2 = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) numbers2.add(i);
        System.out.println("List before reversing: " + numbers2);
        Collections.reverse(numbers);
        System.out.println("List after reversing: " + numbers2);

        List<String> listNames = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
        List<Integer> listNumbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
        System.out.println(listNames);
        System.out.println(listNumbers);

        List<String> listWords = new ArrayList<>();
        listWords.addAll(0, listStrings);
        Object[] arrayWords = listWords.toArray();
//        String[] words = listWords.toArray(new String[0]);
        String[] words = listWords.toArray(new String[0]);
        Integer[] numbers3 = listNumbers.toArray(new Integer[0]);
        System.out.println(words);

    }
}
