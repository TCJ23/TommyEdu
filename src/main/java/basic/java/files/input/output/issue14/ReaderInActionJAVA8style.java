package basic.java.files.input.output.issue14;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderInActionJAVA8style {
    public static void main(String[] args) {

        Path path = Paths.get("wolf-lambs.txt");

        try (BufferedReader reader = Files.newBufferedReader(path);) {
/*                  JAVA 8                          */
            reader.lines().forEach(System.out::println);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}