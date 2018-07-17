package basic.java.files.input.output.issue14;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WritingCharacters {

	public static void main(String[] args) {
		
		Path path = Paths.get("some-text.txt");
		
		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND);) {
			
			PrintWriter pw = new PrintWriter(writer);
			
			pw.printf("%d %o 0x%04x\n", 12, 8, 248);
			
			Calendar calendar = GregorianCalendar.getInstance();
			calendar.set(1969, 6, 20);
			pw.printf(Locale.US, "Man walked on the moon on: %1$tB %1$tA %1$tY" , calendar);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getName(0));
		System.out.println(path.getFileSystem());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.toString());
		System.out.println(path.isAbsolute());
		System.out.println(path.toFile());
	}
}
