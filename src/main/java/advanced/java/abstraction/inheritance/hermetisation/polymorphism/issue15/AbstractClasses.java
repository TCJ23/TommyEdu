package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;


import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-abstract-classes/problem*/
public class AbstractClasses {

    public static void main(String[] args) {
        abstract class Book {
            String title;
            String author;

            Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            abstract void display();
        }

        class MyBook extends Book {

            private int price;

            /**
             *   Class Constructor
             *
             *   @param title The book's title.
             *   @param author The book's author.
             *   @param price The book's price.
             **/
            public MyBook(String title, String author, int price) {
                super(title, author);
                this.price = price;
            }


            @Override
            void display() {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price: " + price);
            }

        }
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
