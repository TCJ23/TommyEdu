package Variables_Finals_Issue_3;

public class Variables_in_Overloaded_Method {

    // if both calc methods were of same DOUBLE or INT type this WILL NOT COMPILE
    double calc(double liczba1, int liczba2) {
        return (liczba1 * liczba2) / 2.5;
    }

    double calc(int liczba2, double liczba1) {
        return (liczba1 * liczba2) / 2.5;
    }

    public static void main(String[] args) {
        Variables_in_Overloaded_Method var = new Variables_in_Overloaded_Method();
//    var.calc(2,3); WONT COMPILE HAVE
        var.calc((double) 2,3);
    }
}
