import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class MavenExample {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        InputStream inputStream = Files.newInputStream(Paths.get("target/classes/application.properties"));
        prop.load(inputStream);

        String property = prop.getProperty("application.name");
        System.out.println(property);
    }
}
