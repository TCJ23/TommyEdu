package advanced.java.collections.issue24;

import java.util.ArrayList;
import java.util.List;

public class ModTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (String str : list) {
            if (str.equals("A")) {
                list.remove("A");
            }
        }
        System.out.println(list);
    }
}

