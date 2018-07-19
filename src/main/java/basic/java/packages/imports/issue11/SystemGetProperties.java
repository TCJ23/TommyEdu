package basic.java.packages.imports.issue11;

import java.util.Map;

import static java.lang.System.out;

public class SystemGetProperties {
    public static void main(String[] args) {

        out.printf("statyczny import");

        // Get property value or null:
        System.out.println("Java version: "
                + System.getProperty("java.version"));

        System.out.println("Unknown property: "
                + System.getProperty("unknown.property"));

        // Use default if not found:
        System.out.println("\nConfig location: "
                + System.getProperty("config.location", "/tmp/config"));

        // List all system properties:
        System.out.println("\nSystem properties:");
        for (Map.Entry<Object, Object> property : System.getProperties().entrySet()) {
            out.printf("%s: %s%n", property.getKey(), property.getValue());
        }
    }
}
