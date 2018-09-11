package advanced.java.design.patterns.issue27.behavioral.iterator.v1;

import java.util.Iterator;

public class IteratorDONOTREMOVE {
    public static void main(String[] args) {

        NamesRepository repository = new NamesRepository();
        repository.addName("John Rambo");
        repository.addName("Terminator T-800");
        repository.addName("Bad Motherfucker");

        Iterator<String> iterator = repository.iterator();

        while (iterator.hasNext()) {
            System.out.println("ELEMENT: " + iterator.next());
            iterator.remove(); //Ta linijka wali wyjątkiem :)
        }

        System.out.println("REPO SIZE: " + repository.getSize());
    }
}
