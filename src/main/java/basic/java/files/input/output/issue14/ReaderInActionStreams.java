package basic.java.files.input.output.issue14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReaderInActionStreams {
    public static void main(String[] args) {

        Path path = Paths.get("wolf-lambs.txt");
        /* TRY WITH RESOURCES THAT IMPLEMENTS AUTOCLOSABLE !!!!!!!*/
        try (Stream<String> lines = Files.newBufferedReader(path).lines();) {
            /*                  STREAMS                          */
            lines.forEach(System.out::println);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
