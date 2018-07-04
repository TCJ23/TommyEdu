package data_input_scanner_Issue_13;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Skaner1 {
    //metoda pomocnicza do okalania napisów apostrofami
    public static String quote(String s) {
        return "'" + s + "'" + " ";
    }

    public static void main(String[] args) {
        // teskt przykładowy
        String txt = "1/2 /3/ 4";
        /*
        Separator?
        Intuicyjnie jedno z: spacja lub znak /
        Przy użyciu skanera można od razu ustalić separator
        */
        String delim = "[ /]";

        Scanner scan = new Scanner(txt).useDelimiter(delim);

        out.println("Tekst : " + quote(txt) + " Separator: " + quote(delim));
        /* WYnik podobnie jak w split() inny od oczekiwań ze względu machiny wyrażeń regularnych
         Uzyskamy 5 symboli zamiast 4:*/

        while (scan.hasNext())
            out.print(quote(scan.next()) + " ");
        /*        Aby uzyskać taki sam wynik jak w StringTokenizer
         należy zastosować wyrażenie regularne 1 lub więcej spacji lub znaków /
        */
        delim = "[ /]+";

        //  nowe skanowanie
        scan = new Scanner(txt).useDelimiter(delim);
        out.println("\nTekst : " + quote(txt) + " Separator: " + quote(delim));

        // 4 symbole
        while (scan.hasNext())
            out.print(quote(scan.next()) + " ");

        // nowy tekst
        txt = " 1/2 /3/ 4";
        scan = new Scanner(txt).useDelimiter(delim);
        out.println("\nTekst : " + quote(txt) + " Separator: " + quote(delim));

        while (scan.hasNext())
            out.print(quote(scan.next()) + " ");

        // SKANER DZIAłA Inaczej niż splittt!
        out.println("\nA split zrobiłby tak:\n" + Arrays.toString(txt.split(delim)));
    }
}
