package advanced.java.toString.issue19;

import java.util.Date;

public class ToStringEx1 {
    public static void main(String[] args) {
    String x = "TCJ";
        System.out.println("Variable x to String" + x.toString());
        System.out.println("Value of x" + String.valueOf(x));
        Date date = new Date();
        System.out.println(date);
        System.out.println("Date by String " + date.toString());
    }

}
