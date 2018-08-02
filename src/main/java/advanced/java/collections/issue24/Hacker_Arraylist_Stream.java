package advanced.java.collections.issue24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*         https://www.hackerrank.com/challenges/java-arraylist/problem     */
public class Hacker_Arraylist_Stream {

    public static void main(String[] args) {
        List parents = new ArrayList();
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.valueOf(scan.nextLine());
            for (int i = 0; i < n; i++) {
                String s = scan.nextLine();
                List<Integer> children = Arrays.stream(s.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
                parents.add(children);
            }
            int query = Integer.valueOf(scan.nextLine());
            for (int i = 0; i < query; i++) {
                int line = scan.nextInt();
                int position = scan.nextInt();
                if(line < parents.size()){
                    List child = (List) parents.get(line-1);
                    if(position < child.size()){
                        System.out.println(child.get(position));
                    }else {
                        System.out.println("ERROR!");
                    }
                }else {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}

