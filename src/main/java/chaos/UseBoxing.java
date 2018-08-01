package chaos;

public class UseBoxing {
    public static void main(String[] args) {
        UseBoxing u = new UseBoxing();
        u.go(5);
    }

    boolean go(Integer i) {
        Boolean ifSo = true;
        Short s = 300;
        if (ifSo) {
            System.out.println(++s);
        }
        return !ifSo;
    }
}
