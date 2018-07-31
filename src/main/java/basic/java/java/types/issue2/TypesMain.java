package basic.java.java.types.issue2;
        /*  Type Bits Bytes Minimum Range Maximum Range
            byte 8 1 –27 27 – 1
            short 16 2 –215 215 – 1
            int 32 4 –231 231 – 1
            long 64 8 –263 263 – 1
            float 32 4 n/a n/a
            double 64 8 n/a n/a */

public class TypesMain {

    boolean prawda = true;
    boolean falsz = false;
    boolean isPrawda, isFalsz; // single line for same data type

    Integer integer = 100;
    float orbit = 1765.65f; //or F or nothing
    double inclination = 120.1762D; //or d or nothing
    //not visible for main unless static


    public static void main(String[] args) {
        //primitives
        char c1 = 122;
        char c2 = '\u0122';
        int hexValue = 0x10B;
        int binaryValue = 0b1_0000_10_11; //binary with underscores
        System.out.println("hexa + binary: " + (hexValue + binaryValue));
        System.out.println("char c1 :" + c1);
        System.out.println("char c2 :" + c2);
        System.out.println("c1 + c2 :" + (c1 + c2));
        //Wrapper Classes
        //Autoboxing
        Boolean prawda = true;
        System.out.println("Autoboxing działa " + prawda);
        Boolean prawdaNews = new Boolean(true);
        System.out.println("Nie poczujesz różnicy bez autoboxingu " + prawda);

        /* Byte, Short, Integer, Long -> cache objects
        Float & Double -> DON'T cache objects
        CACHE ONLY FOR VALUES -128 to 127
        */

        char c = 'a';
        int kod = c;
        System.out.println("Kod znaku" + c + " = " + kod);
        kod = 77;
        c = (char) kod;
        System.out.println("Kod znaku" + c + " = " + kod);
        // jawna konwersja roszerzająca
        System.out.println("Kod znaku" + '*' + " = " + (int) '*');
        // jawna zawężająca
        System.out.println("Kod znaku" + (char) 66 + " = " + 66);
        //char będzie liczony w decymalnym
        char b = 'a' + 1;
        System.out.println(b + " - " + (int) b);
        System.out.println(++b + " - " + (int) b);
    }
}

