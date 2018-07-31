package basic.java.flow.control.issue7;

import java.util.Scanner;

public class Ternary {
    /* Constraints

 Test cases 1 >= T <= 4
  -5 > = age <= 30

        =================================
        Sample Input

        4
        -1
        10
        16
        18
        =================================
        Sample Output

        Age is not valid, setting age to 0.
        You are young.
        You are young.

        You are young.
        You are a teenager.

        You are a teenager.
        You are old.

        You are old.
        You are old.
        */
    public static class Person {

        private int age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                age = 0;
            } else this.age = initialAge;
        }
// ============================ EXAMPLE =========================================== !!!!!!!!!!!!!!
        public void amIOld() {
        System.out.println(age<13 ? "You are young." : age<18 ? "You are a teenager." : "You are old." );
        }

        public void yearPasses() {
            age++;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
    }
}
