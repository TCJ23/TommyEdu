package advanced.java.collections.issue24;

import java.util.*;

public class TCJ_ArrayList implements Comparable<TCJ_ArrayList> {
    String name;

    public String getName() {
        return name;
    }

    public TCJ_ArrayList(String name) {
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
    public int compareTo(TCJ_ArrayList tcj) {
        return name.compareTo(tcj.getName());
    }


    public static void main(String[] args) {
        System.out.println("Each object TCJ_ArrayList will have random name using Random java.util.Random ");
        System.out.println(new TCJ_ArrayList("tcj"));
        System.out.println(new TCJ_ArrayList("nieistotne"));
        System.out.println(new TCJ_ArrayList("tcj"));
        System.out.println("--------------------------- CREATING A ARRAYLIST --------------------------");
        ArrayList<TCJ_ArrayList> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TCJ_ArrayList x = new TCJ_ArrayList("nieistotne");
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
        ArrayList<TCJ_ArrayList> lista2 = new ArrayList<>();
        Collections.addAll(lista2, new TCJ_ArrayList("blee"), new TCJ_ArrayList("blee"), new TCJ_ArrayList("blee"), new TCJ_ArrayList("blee"), new TCJ_ArrayList("blee"));
        System.out.println(lista2 + " rozmiar " + lista2.size());
        TCJ_ArrayList min = Collections.min(lista2);
        TCJ_ArrayList max = Collections.max(lista2);
        System.out.println("\nmin element tej listy to "+ min + "\na max element tej listy to  " + max);
        System.out.println("Postaramy się usunąć min element tej listy " + min);
        System.out.println("\n gdybym chciał przeprowadzić jakąś inną operację w pętli FOREACH jak \n" +
                "lista2.addAll(list);" + " dostałbym\n" +
                "Exception in thread \"main\" java.util.ConcurrentModificationException\n");
        System.out.println("Aktualny romziar listy_2 to " + lista2.size());
        System.out.println("Przeiterujemy się po całej liście i usuniemy jej najmiejszy element a jeśli nie to dodamy nowy\n" +
                "Wprowadzimy ITERATORLIST");

        final ListIterator<TCJ_ArrayList> iterator = lista2.listIterator();
        while (iterator.hasNext()) {
            TCJ_ArrayList iter = iterator.next();
            if (iter.equals(min)) {
                iterator.remove();
            } else
                iterator.add(new TCJ_ArrayList("sdggsd"));
                System.out.println(" W liście pozostają " + iter + " ale za każdym nieznalezionym razem dodawaliśmy nowy obiekt");
        }
        System.out.println("Aktualny rozmiar listy_2 " + lista2.size());

    }
}
