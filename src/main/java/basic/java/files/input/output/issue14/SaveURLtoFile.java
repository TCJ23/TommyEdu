package basic.java.files.input.output.issue14;

import java.io.*;
import java.net.URL;

public class SaveURLtoFile {
    static void convert(InputStream is, String inCp, OutputStream os, String outCp) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(is, inCp));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(os, outCp))) {
            for (String line; (line = in.readLine()) != null; ) {
                out.write(line);
                out.newLine();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream is = new URL("http://edu.pjwstk.edu.pl/wyklady/").openStream();
        convert(is, "ISO8859-2", new FileOutputStream("page.html"), "Cp1250");
    }
}
