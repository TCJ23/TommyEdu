package advanced.java.collections.issue24;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;


public class TCJ_Set_Map {
    private String name;
    private Integer size;

    public static void main(String[] args) {
        List<TCJ_Set_Map> arrayLista = create10TCJdupes("bla bla", 5);
        List<TCJ_Set_Map> arrayLista2 = create10TCJdupes("hi hi ", 19);
        List<String> stringi = new ArrayList<>();
        List<String> stringi2 = new ArrayList<>();
        arrayLista.addAll(arrayLista2);
        for (TCJ_Set_Map t : arrayLista
                ) {
            System.out.println(t);
            String s = t.toString();
            stringi.add(s);
        }
        for (TCJ_Set_Map t : arrayLista2
                ) {
            System.out.println(t);
            String s = t.toString();
            stringi2.add(s);
        }
        System.out.println("Current list contains duplicates, and its size is " + arrayLista.size());
        System.out.println("Current STRING List contains duplicates, and its size is " + stringi.size());
        System.out.println("Now lest introduce HASHSET so we can remove duplicates in one move\n" +
                "Collection<Type> noDups = new HashSet<Type>(c);\n");
        Collection<String> noDupes = new HashSet<String>(stringi);
        System.out.println("Hashset size is " + noDupes.size());

        Set<String> uniques = new HashSet<String>(stringi);
        Set<String> dups    = new HashSet<String>(stringi);
        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }

    public TCJ_Set_Map(String name, Integer size) {
        if (size > 5) {
//            String generateSize = RandomStringUtils.random(size);
            String generateName = RandomStringUtils.random(size, name);
            this.name = "TCJ" + generateName;
//            this.size = Integer.valueOf(generateSize);
            this.size = size;
        } else if (size <= 5) {
//            String generateSize = RandomStringUtils.random(size);
            String generateName = RandomStringUtils.random(size, name);
            this.name = generateName + "TCJ";
//            this.size = Integer.valueOf(generateSize);
            this.size = size;
        }
    }

    static List<TCJ_Set_Map> create10TCJdupes(String name, Integer size) {
        ArrayList<TCJ_Set_Map> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i <= 5) {
                TCJ_Set_Map x = new TCJ_Set_Map("bla", 1);
                arrayList.add(x);
            } else {
                TCJ_Set_Map x = new TCJ_Set_Map("bla", 10);
                arrayList.add(x);
            }
        }
        return arrayList;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and my size is " + size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }
}
