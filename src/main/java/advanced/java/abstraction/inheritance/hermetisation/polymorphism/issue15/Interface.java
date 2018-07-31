package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;

/* https://www.hackerrank.com/challenges/30-interfaces/problem */

import java.util.Scanner;
import java.util.stream.IntStream;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println("I implemented: " + myCalculator.getClass().getCanonicalName());
        System.out.println("I implemented: " + myCalculator.getClass().getSimpleName());
        System.out.println("I implemented: " + myCalculator.getClass().getTypeName());
        System.out.println("I implemented: " + myCalculator.getClass().getSuperclass().getSimpleName());
        System.out.println(sum);
    }

    /*      TRYING JAVA 8           */
    @Override
    public int divisorSum(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }


/*
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }*/
}


