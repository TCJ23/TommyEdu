package advanced.java.EqualsAndHashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pair {
    public String name1;
    public String name2;

    Pair(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;
        if (name1.equals(pair.name1) &&
                name2.equals(pair.name2)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = name1.hashCode();
        result = 31 * result + name2.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Pair> set = new HashSet<>();
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            set.add(new Pair(scanner.next(), scanner.next()));
            System.out.println(set.size());
        }

    }
}
