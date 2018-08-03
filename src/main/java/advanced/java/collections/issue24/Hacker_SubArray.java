package advanced.java.collections.issue24;

import java.util.Arrays;
import java.util.stream.IntStream;

/*https://www.hackerrank.com/challenges/java-negative-subarray/problem*/
public class Hacker_SubArray {

    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();*/

        int size = 5;
        int[] array = {1, -2, 4, -5, 1};
/*
        int someArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : someArray)
            sum += i;*/

     /*   int[] a = {10,20,30,40,50};
        int sum = IntStream.of(a).sum();
        System.out.println("The sum is " + sum);*/

        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int sum = IntStream.of(Arrays.copyOfRange(array, i, j + 1)).sum();
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
