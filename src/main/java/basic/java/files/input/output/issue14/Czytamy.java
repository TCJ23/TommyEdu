package basic.java.files.input.output.issue14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Czytamy {
    public static void main(String[] args) {
        Path path = Paths.get("./adam.txt");
        try {
            Files.write(path, "hej hej hej kup se klej".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List<String> strings = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
