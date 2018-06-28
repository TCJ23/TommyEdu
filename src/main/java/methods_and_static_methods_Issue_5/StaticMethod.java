package methods_and_static_methods_Issue_5;

class StaticMethod {
    public static void main(String[] args) {

        TCJStatic.tcjMe("TCJstatic");
        System.out.println(TCJStatic.tcjname);

        TCJStatic obj = new TCJStatic();
        obj.tcjMe("tcjStatic");
        System.out.println(obj.tcjname);
    }
}
