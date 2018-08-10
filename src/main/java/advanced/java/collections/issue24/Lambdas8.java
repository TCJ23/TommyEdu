package advanced.java.collections.issue24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambdas8 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "lemon", "orange");

        System.out.println("==== Classic enhanced for loop ====");

        for (String aFruit : fruits) {
            System.out.println(aFruit);
        }


        System.out.println("\n==== Anonymous class ====");

        fruits.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        });


        System.out.println("\n==== Lambda Expression ====");

        fruits.forEach(s -> System.out.println(s));


        System.out.println("\n==== Lambda Method Reference ====");

        fruits.forEach(System.out::println);


        System.out.println("\n==== Lambda Method Reference 2 ====");

        fruits.forEach(Fruit::countWord);
    }

}

class Fruit {
    static void countWord(String s) {
        System.out.println(s.length());
    }
}
