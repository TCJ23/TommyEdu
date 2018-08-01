package advanced.java.collections.issue24;

import java.util.ArrayList;

class BreakingEncapsulation {
    private String name;
    private ArrayList<Integer> list;

    BreakingEncapsulation() {
        list = new ArrayList<Integer>();
    }

    String getName() {
        return name;
    }

    void addToList(int x) {
        list.add(x);
    }

    ArrayList getList() {
        return list;
    }
}
