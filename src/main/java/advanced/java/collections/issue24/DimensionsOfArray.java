package advanced.java.collections.issue24;

public class DimensionsOfArray {
    public static void main(String[] args) {
        int[][] a ={
            {1,2},
            {3,4}
        };
        int[] b = (int[]) a[1];
        Object o1 = a;
        int[][] a2 = (int[][]) o1;
//        int[] b2 = (int[]) o1;  RUNTIME EXCEPTION
        int[][] b2 = (int[][]) o1;
        System.out.println(b[1]);
    }
}
