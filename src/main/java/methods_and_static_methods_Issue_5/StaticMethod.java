package methods_and_static_methods_Issue_5;

class StaticMethod {
    public static void main(String[] args) {

        TCJStatic.tcjMe("Tommy J");
        System.out.println(TCJStatic.name);

//        //by Object reference
        TCJStatic obj = new TCJStatic();
        obj.tcjMe("J Tommy");
        System.out.println(obj.name);
    }
}
