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
//        return list;
        return new ArrayList(list);
    }

    public static void main(String[] args) {
        BreakingEncapsulation breakingEncapsulation = new BreakingEncapsulation();
        breakingEncapsulation.addToList(5);
        breakingEncapsulation.addToList(4);
        breakingEncapsulation.addToList(1);
        breakingEncapsulation.addToList(2);
        breakingEncapsulation.name = "dupa";
        ArrayList<Integer> lista = breakingEncapsulation.list;
        System.out.println("Name " + breakingEncapsulation.getName());
        System.out.println("GetList " + breakingEncapsulation.getList());
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("element " + lista.get(i));
        }
        for (Integer b : lista
                ) {
            System.out.println(b);
        }
    }
}

