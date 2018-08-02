package advanced.java.collections.issue24;

import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 THIS SHOULD BE DONE BY MAPS DUE TO PERFORMANCE
https://codereview.stackexchange.com/questions/1690/optimizing-java-anagram-checker-compare-2-strings
https://stackoverflow.com/questions/15045640/how-to-check-if-two-words-are-anagrams
https://github.com/RodneyShag/HackerRank_solutions/blob/master/Java/Strings/Java%20Anagrams/Solution.java
*/
public class AnagramByMapv2 {
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

    //  Time Complexity: O(n) using a HashMap
    // Space Complexity: O(n)
    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        /* Fill HashMap with 1st String */
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            map.merge(ch, 1, Integer::sum);
        }

        /* Compare 2nd String to 1st String's HashMap */
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
