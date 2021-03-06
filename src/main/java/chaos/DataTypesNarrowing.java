package chaos;

import java.util.Scanner;

/*          https://www.hackerrank.com/challenges/java-datatypes/problem */
public class DataTypesNarrowing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = scan.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");

                /*if (((Long) x) instanceof Long) {
                    System.out.println("Long");
                }
                if (((Byte) x) instanceof Byte) {
                    System.out.println("Byte");
                }*/
                /*     DYNAMIC CASTING       */

/*
                if (Byte.class.isInstance(x)) {
                    System.out.println("* byte");
                }
                if (Short.class.isInstance(x)) {
                    System.out.println("* short");
                }
                if (Integer.class.isInstance(x)) {
                    System.out.println("* int");
                }
                if (Long.class.isInstance(x)) {
                    System.out.println("* long");
                }
*/

                /*
                if (x== (byte)x) System.out.println("* byte");
                if (x== (short)x) System.out.println("* short");
                if (x== (int)x) System.out.println("* int");
                if (x== (long) x) System.out.println("* long");
                */
//                Byte aByte = new Byte(String.valueOf(x));

//                Integer integer = new Integer((int) x);
            }

        }
        scan.close();
    }
}
