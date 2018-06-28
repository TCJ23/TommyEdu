package object_and_classes_Issue_6;

public class Dinglemouse {

    private static int ONE_HUNDRED = 100;
    public static final Dinglemouse INST = new Dinglemouse();
    private static int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(Dinglemouse.INST.plus100(23));
    }
}

