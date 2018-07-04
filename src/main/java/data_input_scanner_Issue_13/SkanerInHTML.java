package data_input_scanner_Issue_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SkanerInHTML {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(new File("plikHTML.html").getAbsolutePath());
        Scanner fscan = new Scanner(new File("D:\\Library\\TommyEdu\\plikHTML.html"));
        String h2regex = "(?s)(?i)<h3>(.+?)</h3>";
        while (fscan.findWithinHorizon(h2regex, 0) != null){
            String title = fscan.match().group(1);
            System.out.println(title);
        }
        fscan.close();
    }
}
