package chaos;

public class JavaisStrictlyPassbyValue {
    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x);
    }

    public static void change(int x) {
       /* int y = 10;
        x = y;
//        return y;*/
//        int x = 10;
//       return x;
        x =10;
    }
}
