package advanced.java.collections.issue24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*     https://www.hackerrank.com/challenges/java-comparator/problem             */
class Hacker_Comparator implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score == p2.score) {
            return p1.name.compareToIgnoreCase(p2.name);
        } else return p1.score > p2.score ? -1 : p1.score == p2.score ? 0 : 1;
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Hacker_Comparator checker = new Hacker_Comparator();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}