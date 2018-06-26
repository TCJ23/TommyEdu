package flow_control_Issue_7;

import javax.swing.*;

public class NestedSwitch {
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Liczba"));
        outerSwitch:
        switch (i) {
            case 1:
                switch (testNum(i)) {
                    case 1:
                        System.out.println("same one");
                        break;
                    case 2:
                        System.out.println("double one");
                        break outerSwitch;
                    default:
                        System.out.println("other one");
                        break;
                }
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other two");
                break;
        }
        System.out.println("Koniec");
    }

    static int testNum(int n) {
        return n * 2;
    }
}
