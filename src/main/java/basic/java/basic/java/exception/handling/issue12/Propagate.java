package basic.java.basic.java.exception.handling.issue12;

public class Propagate {
    static String s;

    public static void main(String[] args) {
        try {
            Propagate.reverse(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Main has finished its life");
        }
    }

    private static String reverse(String s) throws Exception {
        if (s.length() == 0) {
            throw new Exception();
        } else {
            String reverseStr = "";
            for (int i = s.length() - 1; i >= 0; --i) {
                reverseStr += s.charAt(i);
            }
            return reverseStr;
        }
    }
}
