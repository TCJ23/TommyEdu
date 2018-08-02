package advanced.java.collections.issue24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        this.name = name + "+ TCJ";
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
        System.out.println("Each object TCJ will have random name using Random java.util.Random ");
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
        System.out.println("Lista zawiera " + list.size() + " elementów ");
        System.out.println("Nieposortowana lista - musimy zaimplementować Comparable   \n" + list);
        System.out.println();
        Collections.sort(list);
        System.out.println("Posortujemy tą listę : Collections.sort(list)   \n" + list);
        System.out.println();
        Collections.rotate(list, 2);
        System.out.println("Zawirujmy albo obróćmy tą listę, pozamieniamy jej elementy co 2, za pomocą Collections.rotate(list, 2); \n "
                + list);
        System.out.println();
        Collections.shuffle(list);
        System.out.println("Pomieszajmy tą listę jeszcze raz za pomocą: Collections.shuffle(list)     \n" + list);
        System.out.println();
        System.out.println("Zrobimy nową listę 5 elementów, za pomocą Collections.addAll");
        System.out.println();
        ArrayList<TCJ> lista2 = new ArrayList<>();
        Collections.addAll(lista2, new TCJ("blee"), new TCJ("blee"), new TCJ("blee"), new TCJ("blee"), new TCJ("blee"));
        System.out.println(lista2 + " rozmiar " + lista2.size());
        TCJ min = Collections.min(lista2);
        TCJ max = Collections.max(lista2);
        System.out.println("\nmin i max element tej listy to  " + min + " & " + max);
        System.out.println("Postaramy się usunąć min element tej listy " + min);
        System.out.println("\n gdybym chciał przeprowadzić jakąś inną operację w pętli FOREACH jak \n" +
                "lista2.addAll(list);" + " dostałbym\n" +
                "Exception in thread \"main\" java.util.ConcurrentModificationException\n");
        System.out.println("Aktualny romziar listy_2 to " + lista2.size());
        System.out.println("Przeiterujemy się po całej liście i usuniemy jej najmiejszy element a jeśli nie to dodamy nowy\n" +
                "Wprowadzimy ITERATORLIST");

        final Iterator<TCJ> iterator = lista2.iterator();
        while (iterator.hasNext()) {
            TCJ iter = iterator.next();
            if (iter.equals(min)) {
                iterator.remove();
            } else
                System.out.println(" W liście pozostają " + iter);
        }
        System.out.println(lista2.size());


      /*  final ListIterator<TCJ> iterator = lista2.listIterator();
        while (iterator.hasNext()) {
            TCJ iter = iterator.next();
            if (iter.equals(min)) {
                iterator.remove();
                lista2.remove(iter);
//            } else iterator.add(new TCJ("iterator!"));
//            } else list.addAll(lista2);
            }
            System.out.println("ile");
        }
        System.out.println("Nasza nowa lista_2" + lista2 + "\n" +
                " ma rozmiar " + lista2.size());
        System.out.println("Nasza nowa lista " + list + "\n" +
                " ma rozmiar " + list.size());*/
    }
}
