package advanced.java.collections.issue24;

import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 THIS SHOULD BE DONE BY MAPS DUE TO PERFORMANCE
https://codereview.stackexchange.com/questions/1690/optimizing-java-anagram-checker-compare-2-strings
https://stackoverflow.com/questions/15045640/how-to-check-if-two-words-are-anagrams
*/
public class AnagramByMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
        String a = "anagram";
        String b = "margana";
//        String b = scanner.nextLine();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
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
            HashMap<Character, Integer> lettersInWord1 = new HashMap<>();
            for (char c : ch1) {
                int count = 1;
                if (lettersInWord1.containsKey(c)) {
                    count = lettersInWord1.get(c) + 1;
                }
                lettersInWord1.put(c, count);
                System.out.print("letter-> " + c + "\n");
                System.out.println("count "+ count);
            }
            System.out.println("Second word");
            for (char c : ch2) {
                int count = -1;
                if (lettersInWord1.containsKey(c)) {
                    count = lettersInWord1.get(c) - 1;
                }
                lettersInWord1.put(c, count);
                System.out.print("letter-> " + c + "\n");
                System.out.println("count " + count);
            }

            for (char c : lettersInWord1.keySet()) {
                if (lettersInWord1.get(c) != 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
