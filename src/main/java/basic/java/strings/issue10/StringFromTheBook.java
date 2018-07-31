package basic.java.strings.issue10;

public class StringFromTheBook {
    public static void main(String[] args) {
        String tcj = "TCJ";
        System.out.println("TCJ"==tcj);
        String tcj2 = new String("TCJ");
        System.out.println("TCJ"==tcj2 + " NOT IN CONSTANT POOL");
        StringBuilder sb = new StringBuilder();
    }

}
