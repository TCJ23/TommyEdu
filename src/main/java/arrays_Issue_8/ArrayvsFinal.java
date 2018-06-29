package arrays_Issue_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayvsFinal {
    // TO DO FINAL with ARRAY
    //    https://stackoverflow.com/questions/10339930/final-array-in-java#10340003
    public static void main(String[] args) {
        final String[] myArray = {"hi", "there"};
        myArray[0] = "game";  // perfectly fine, final has nothing to do with it
        myArray[1] = "over";  // perfectly fine, final has nothing to do with it
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        List<String> items = Collections.unmodifiableList(Arrays.asList("I", "can", "never", "change"));
        for (String s: items
             ) {
            System.out.print(s + " ");

        }
    }
    // myArray = anotherArray; ------>// Error, you can't do that. myArray is final
}

