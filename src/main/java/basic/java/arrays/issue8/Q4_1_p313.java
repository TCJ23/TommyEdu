package basic.java.arrays.issue8;

public class Q4_1_p313 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        byte b =4; char c = 'c'; long longVar = 10;
        arr[0] = b;
        arr[1] = c;
        arr[3] = (int) longVar;
        System.out.println( arr[0] + arr[1] + arr[2] + arr[3]);
    }
}
