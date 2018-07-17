package basic.java.files.input.output.issue14;

import java.io.File;
import java.io.IOException;
public class FilePathTest {

    public static void main(String[] args) throws IOException {
        accessFileUsingAbsolutePath();
//        accessFileUsingRelativePath();
    }

    private static void accessFileUsingAbsolutePath()
    {
        System.out.println("Access file using absolute path: ");
        String absolutePath = "D:\\Library\\TommyEdu\\src\\main\\java\\basic\\java\\files\\input\\output\\issue14\\files\\archive.zip";
        File file = new File(absolutePath);
        printPaths(file);
    }

  /*  private static void accessFileUsingRelativePath()
    {
        System.out.println("Access file relatively in different ways: ");
        // This goes back to the root drive of the current directory.
        System.out.println("Access file relative to the root drive of the current directory: ");
        File fileRelative = new File("src\\main\\java\\basic\\java\\files\\input\\output\\issue14\\files\\archive.zip");
        printPaths(fileRelative);

        // This goes up 2 levels from the current directory
        System.out.println("Access file relative to the current directory: ");
        File fileRelative2 = new File("../../src\\main\\java\\basic\\java\\files\\input\\output\\issue14\\files\\archive.zip");
        printPaths(fileRelative2);

        System.out.println("Access file relative to the current directory: ");
        File fileRelative3 = new File("../.././src\\main\\java\\basic\\java\\files\\input\\output\\issue14\\files\\archive.zip");
        printPaths(fileRelative3);
    }*/

    private static void printPaths(File file)
    {
        try
        {
            System.out.println("File Path = " + file.getPath());
            System.out.println("Absolute Path = " + file.getAbsolutePath());
            System.out.println("Canonical Path = " + file.getCanonicalPath());
            System.out.println("\n");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}