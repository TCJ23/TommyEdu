package basic.java.files.input.output.issue14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReaderInAction {


    public static void main(String[] args) {

        Path path = Paths.get("D:\\Library\\TommyEdu\\bat-weasels.txt");

        try (Stream<String> lines = Files.newBufferedReader(path).lines();) {

            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
