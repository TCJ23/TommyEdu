package basic.java.arrays.issue8;

import java.util.Arrays;

public class OneDimArray {

    public static void main(String[] args) {
        int[] intArray = new int[(int) 10.4]; // strange initialization and allocation size cannot be double
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 5;
            intArray[1] = 666;
            intArray[7] = 666;
            System.out.println(intArray[i]);
        }
        String[][] poryRoku = {{"Lato", "Wiosna"}, {"Zima", "Jesień"}}; //MULTI string
        System.out.println(Arrays.deepToString(poryRoku));

        String asymetryczna[][] = new String[][]{{"Dupa", "Kupa"}, null
                , {"TCJ", "UTK","KTJ"}};
        System.out.println(Arrays.deepToString(asymetryczna));
        System.out.println(asymetryczna[2][2]);
    }
}
