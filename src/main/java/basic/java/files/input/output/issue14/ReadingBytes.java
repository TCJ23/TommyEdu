package basic.java.files.input.output.issue14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingBytes {

    public static void main(String[] args) {

		String fileName = "ints.bin";
//        String fileName = "ints.bin.gz";

        try {
            Path path = Paths.get(fileName);
            long size = Files.size(path);
            System.out.println(path + " size: " + size);
        } catch (IOException e) {
        }

        try (InputStream is = new FileInputStream(new File(fileName));
//			 GZIPInputStream gzis = new GZIPInputStream(is);
//			 DataInputStream dis = new DataInputStream(gzis);) {
             DataInputStream dis = new DataInputStream(is);) {
/*      READING CODE DOESN'T CHANGE IN ANYWAY               */
            List<Integer> ints = new ArrayList<>();
            try {
                while (true) {
                    ints.add(dis.readInt());
                }
            } catch (EOFException e) {
            }
            System.out.println("ints: " + ints.size());

        } catch (IOException e) {
        }
    }
}
