package methods_and_static_methods_Issue_5;

class CFG {
    public static void main(String[] args) {
        Geek.geek("TCJ");
        System.out.println(Geek.geekName);

        Geek obje = new Geek();
        obje.geek("tcj");
        System.out.println(obje.geekName);
    }
}
