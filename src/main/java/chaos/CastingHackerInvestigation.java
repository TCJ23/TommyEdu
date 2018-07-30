package chaos;

import java.util.Scanner;

public class CastingHackerInvestigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                String x = sc.next();
                System.out.println(x + " can be fitted in:");
                if (Byte.class.isInstance(Byte.valueOf(x))) {
                    System.out.println("* byte");
                }
                if (Short.class.isInstance(Short.valueOf(x))) {
                    System.out.println("* short");
                }
                if (Integer.class.isInstance(Integer.valueOf(x))) {
                    System.out.println("* int");
                }
                if (Long.class.isInstance(Long.valueOf(x))) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
