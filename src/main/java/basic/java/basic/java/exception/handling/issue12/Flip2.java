package basic.java.basic.java.exception.handling.issue12;


public class Flip2 {
   /*INPUT = RED Green YeLLow*/
    public static void main(String[] args) {
        String o = "-";
        String[] sa = new String[4]; // syntax legal nullpointer exception
        for (int i = 0; i < args.length; i++)
            sa[i] = args[i];
        for (String n : sa) {
            switch (n.toLowerCase()) {
                case "yellow":
                    o += "y";
                case "red":
                    o += "r";
                case "green":
                    o += "g";
            }
        }
        System.out.print(o);
    }
}