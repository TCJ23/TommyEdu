package strings_Issue_9;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/valid-username-checker/problem

public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static class UsernameValidator {
//        ■ \w A word character (letters (a–z and A–Z), digits, or the "_" [underscore])

        public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
    }
}

