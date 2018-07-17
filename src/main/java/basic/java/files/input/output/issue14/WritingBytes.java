package basic.java.files.input.output.issue14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.zip.GZIPOutputStream;

public class WritingBytes {

    public static void main(String[] args) {

//        String pathname = "ints.bin";// for gzip change to ints.bin.gz
        String pathname = "ints.bin.gz";
        File file = new File(pathname);

        /*      MUST BE WITHIN TRY RESOURCES TO BE PROPERLY CLOSED AND FLUSHED*/

        try (OutputStream os = new FileOutputStream(file);
             GZIPOutputStream gzos = new GZIPOutputStream(os);
//             DataOutputStream dos = new DataOutputStream(os); // gzos here
             DataOutputStream dos = new DataOutputStream(gzos);
        ) {
			
			IntStream.range(0, 1000)
			.forEach(
					i -> { try { dos.writeInt(i); } catch (IOException e) {} }
			);
            dos.writeInt(100);
            dos.writeUTF("TCJ");
            dos.writeUTF("łódź");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Path path = Paths.get(pathname);
            long size = Files.size(path);
            System.out.println(path + " size: " + size);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
