package advanced.java.generics.issue23;

import java.lang.reflect.Method;

/*       https://www.hackerrank.com/challenges/java-generics/problem       */
public class Hacker_Generics {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
class Printer
{
    public <T> void printArray(T[] intArray) {
        for (T t:intArray
             ) {
            System.out.println(t);
        }
    }
    //Write your code here

}