package Variables_Finals_Issue_3;

public class Variables_Finals {

    final static int x = 10; // THAT IS FOREVER !
    public static void main(String[] args) {
        System.out.println(x);
//        x = x * 2; WONT COMPILE
        System.out.println(x + 2);
    }
}
