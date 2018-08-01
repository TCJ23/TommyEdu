package advanced.java.collections.issue24;

class Box {
    int size;

    public Box(int size) {
        size = size;
    }
}

public class Laser {
    public static void main(String[] args) {
        Box b1 = new Box(5);
        Box[] ba = go(b1, new Box(6));
        ba[0] = b1;
        for (Box b: ba
             ) {
            System.out.println(b.size);
        }
    }

    static Box[] go(Box b1, Box b2) {
        b1.size = 4;
        Box[] ma = {b2, b1};
        return ma;
    }
}
