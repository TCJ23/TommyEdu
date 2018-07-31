package basic.java.object.and.classes.issue6;

public class Dinglemouse {

    private static int ONE_HUNDRED = 100;
    private static int value;
    public static final Dinglemouse INST = new Dinglemouse();

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(ONE_HUNDRED);
        System.out.println(value);
        System.out.println(Dinglemouse.INST.plus100(23));
        System.out.println(ONE_HUNDRED);
        System.out.println(value);
    }
}

