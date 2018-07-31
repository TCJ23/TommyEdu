package basic.java.methodsAndStaticMethods.issue5;

 class InstanceMethod {
    public static void main(String[] args) {

        TCJinstance tcj = new TCJinstance();

        tcj.tcjMe("Tommy J");
        System.out.println(tcj.name);
    }
}
