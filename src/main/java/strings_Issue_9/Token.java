package strings_Issue_9;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-string-tokens/problem
public class Token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] items = s.trim().split("[ !,?.\\_'@]+");
        if (s == null || s.trim().equals("")) {
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(items.length);
        }

        for(String item: items){
            System.out.println(item);
        }
        scan.close();
    }
}
