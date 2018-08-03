package advanced.java.collections.issue24;

import java.util.Arrays;

public class Java7Spec {
    public static void main(String[] args) {
        int[] ia = new int[101];
        for (int i = 0; i < ia.length; i++) ia[i] = i;
        int sum = 0;
        for (int e : ia) sum += e;
        System.out.println(Arrays.toString(ia));
        System.out.println(sum);
    }
}
