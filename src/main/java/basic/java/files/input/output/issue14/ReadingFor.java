package basic.java.files.input.output.issue14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFor {
    public static void main(String[] args) {
        String s;
        try {
            FileReader fr = new FileReader("ABCD.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null) {
                System.out.println(s);
//                br.flush NOT POSSIBLE IN READER !!!!!!!!
            }
        } catch (IOException e) {
            System.out.println("io error");
        }
    }
}
