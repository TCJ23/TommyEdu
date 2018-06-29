package arrays_Issue_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListy {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add(new String("new Twój Stary"));
    arrayList.add("Twój Stary");
    arrayList.add("Twój Stary");
        for (String s:arrayList
             ) {
            System.out.println(s);
        }
        for (String s:arrayList
             ) {
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        } // pytanie strona 266
        //https://stackoverflow.com/questions/157944/create-arraylist-from-array GUAVA ?
//        Object[] list = arrayList.toArray();


//        ==============================PYTANIA!!!!!!!!!!=========================
        // p.273
        //        https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string

//        ArrayList<StringBuilder> stringi = new ArrayList<>();
//                stringi.addAll(arrayList);
//
//        ArrayList<StringBuilder> stringi2 = new ArrayList<StringBuilder>(arrayList);

        Collections.addAll(arrayList);
    }
}
