package advanced.java.collections.issue24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TCJ implements Comparable<TCJ> {
    String name;

    public String getName() {
        return name;
    }

    public TCJ(String name) {
        Random random = new Random();
        int first = random.nextInt(26) + 65;  //Get random ASCII code in letter range
        char firstChar = new Character((char) first);  //Convert to char
        int suffix = 10000 + random.nextInt(89999);  //Get 5 digit suffix
        name = Character.toString(firstChar) + String.valueOf(suffix);
        this.name = "TCJ + " + name;
    }

    @Override
    public String toString() {
        return name;

    }

    @Override
    public int compareTo(TCJ tcj) {
        return name.compareTo(tcj.getName());
    }


    public static void main(String[] args) {
        System.out.println("Each object TCJ will have random name using Random ");
        System.out.println(new TCJ("tcj"));
        System.out.println(new TCJ("nieistotne"));
        System.out.println(new TCJ("tcj"));
        System.out.println("--------------------------- CREATING A ARRAYLIST --------------------------");
        ArrayList<TCJ> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TCJ x = new TCJ("nieistotne");
            System.out.println(x);
            list.add(x);
        }
        System.out.println("Lista zawiera " + list.size() +" elementów ");
        System.out.println("Nieposortowana lista - musimy zaimplementować Comparable   " + list);
        Collections.sort(list);
        System.out.println("Posortujemy tą listę : Collections.sort(list)   " + list);
        Collections.rotate(list, 2);
        System.out.println("Zawirujmy albo obróćmy tą listę, pozamieniamy jej elementy co 2, za pomocą Collections.rotate(list, 2);  "
                + list);
        Collections.shuffle(list);
        System.out.println("Pomieszajmy tą listę jeszcze raz za pomocą: Collections.shuffle(list)     " + list);

        System.out.println("Zrobimy nową listę 5 elementów, za pomocą Collections.addAll");
        ArrayList<TCJ> lista2 = new ArrayList<>();
        Collections.addAll(lista2, new TCJ("blee"), new TCJ("blee"), new TCJ("blee"), new TCJ("blee"), new TCJ("blee"));
        System.out.println(lista2 + " rozmiar " + lista2.size());
        TCJ min = Collections.min(lista2);
        TCJ max = Collections.max(lista2);
        System.out.println("min i max element tej listy to  " + min + " & " + max);
    }


}
