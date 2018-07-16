package basic.java.files.input.output.issue14;


import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOandNIOexamples {
    public static void main(String[] args) throws IOException {
   /*     String name = "";
        Console c = System.console(); // #1: get a Console
        char[] pw;
        pw = c.readPassword("%s", "pw: "); // #2: return a char[]
        for (char ch : pw)
            c.format("%c ", ch); // #3: format output
        c.format("\n");
        MyUtility mu = new MyUtility();
        while (true) {
            name = c.readLine("%s", "input?: "); // #4: return a String
            c.format("output: %s \n", mu.doStuff(name));
        }
    }
}

class MyUtility { // #5: class to test
    String doStuff(String arg1) {
        arg1 = "";
        return "result is " + arg1;
    }*/
        Path path = Paths.get("21221.txt"); // it's only an object
        Files.deleteIfExists(path);
        System.out.println(Files.exists(path)); // look for a real file1
        Files.createFile(path); // create a file1!
        System.out.println(Files.exists(path)); // look again
        /* I/O Approach */
        File file = new File("TCJ");
        file.createNewFile();
        File file1 = new File("dir");
        file1.mkdir();
        File file2 = new File("/a/b/c");
        file2.mkdirs();
        File file3 = new File("test");
        file3.exists();

        /*NIO.2 Approach*/
        Path path1 = Paths.get("test");
        Files.createFile(path1);
        Path path2 = Paths.get("dirNIO2");
        Files.createDirectory(path2);
        Path path3 = Paths.get("/a/b/c");
        Files.createDirectories(path3);
        Path path4 = Paths.get("testNIO");
        Files.exists(path4);

    }
}