package advanced.java.design.patterns.issue27.behavioral.iterator.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Taka klaska rozwiązuje ci problem modyfikacji listy. Zamiast addName(String) możesz dodać metodę addAll(List<String>)
public class NamesRepository implements Iterable<String> {
    private List<String> names;
    private int index;

    public NamesRepository() {
        this.names = new ArrayList<>();
        this.index = 0;
    }

    public void addName(String name) {
        names.add(name);
    }

    public int getSize() {
        return names.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < names.size() && names.get(currentIndex) != null;
            }

            @Override
            public String next() {
                return names.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        };
    }
}