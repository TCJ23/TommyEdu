package basic.java.files.input.output.issue14;

import java.io.File;
/*Invocation java Directories file2.txt
 output false true*/
class Directories {
    static String[] dirs = {"dir1", "dir2"};

    public static void main(String[] args) {
        for (String d : dirs) {
// insert code 1 here
            String path = d;
            File file = new File(path, args[0]);
// insert code 2 here
            System.out.println(file.exists() + " ");
            System.out.println(file.isFile() + " ");

        }
    }
}