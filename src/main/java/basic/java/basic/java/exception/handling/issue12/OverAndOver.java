package basic.java.basic.java.exception.handling.issue12;

public class OverAndOver {
    static String s = "";

    public static void main(String[] args) {
        try {
            s += "1";
            throw new Exception();
        } catch (Exception e) {
            s += "2";
        } finally {
            s += "3";
            try {
                doStuff();
            } catch (Exception e) {
                e.printStackTrace();
            }
            s += "4";
        }
        System.out.println(s);
    }

    static void doStuff() {
        int x = 0;
        int y = 7 / x;
    }
}
