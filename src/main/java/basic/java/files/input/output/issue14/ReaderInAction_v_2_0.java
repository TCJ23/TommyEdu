package basic.java.files.input.output.issue14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderInAction_v_2_0 {
    public static void main(String[] args) {
        File file = new File("wolf-lambs.txt");
        try (FileReader fileReader = new FileReader(file);) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
