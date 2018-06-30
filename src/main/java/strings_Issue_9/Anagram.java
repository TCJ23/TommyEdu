package strings_Issue_9;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 THIS SHOULD BE DONE BY MAPS DUE TO PERFORMANCE
https://codereview.stackexchange.com/questions/1690/optimizing-java-anagram-checker-compare-2-strings
https://stackoverflow.com/questions/15045640/how-to-check-if-two-words-are-anagrams
*/

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (isAnagram(a,b)){
            System.out.println("Anagrams");
        }
        else {
            System.out.println();
        }
        scanner.close();
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] ch1 = a.trim().toLowerCase().toCharArray();
            char[] ch2 = b.trim().toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        }
    }

}
