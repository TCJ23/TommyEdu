package casting_Issue_4;

public class CastingExample {

    static byte b = 27; //implicit
    static byte c = (byte) 27;//explicit

    static byte tooLarge = (byte) 128; // MUST cast

    //implicit
    static int a = 100;
    static long d = a;
    //explicit
    static float f = 100.001f;
    static int g = (int) f;

    public static void main(String[] args) {
        System.out.println(b + c);
        System.out.println(f + g);
    }

}
