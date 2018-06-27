package methods_and_static_methods_Issue_5;

class TCJStatic {
    static String name = "";

    //    public static String name ="";
    static void tcjMe(String name) {
        name = name; //czemu bez this?
    }
//    public static void tcjMe(String name){
//        name = name; //czemu bez this?
}

