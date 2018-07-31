package basic.java.strings.issue10;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/tag-content-extractor/problem
public class Tag_Content_Extractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String h2regex = "(?s)(?i)<>(.+?)</>";
            while (in.findWithinHorizon(h2regex,0) != null){
                String text = in.match().group(1);
                System.out.println(text);
            }
            testCases--;
        }
    }
}
