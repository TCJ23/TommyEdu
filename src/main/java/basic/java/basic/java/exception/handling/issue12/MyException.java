package basic.java.basic.java.exception.handling.issue12;

public class MyException {
    public static void main(String[] args) {
        for (String food : args) {
            try {
                MyException.checkfood(food);
            } catch (BadFoodException e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkfood(String s) throws BadFoodException {
        if (s == "malina") {
            System.out.println("I like it");
        } else throw new BadFoodException();
    }
/*
        for (int i = 0; i < args.length - 1; i++) {
            System.out.println(args[i]);
        }
*/
    }
