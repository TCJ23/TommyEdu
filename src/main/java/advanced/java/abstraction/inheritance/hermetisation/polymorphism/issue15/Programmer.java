package advanced.java.abstraction.inheritance.hermetisation.polymorphism.issue15;


/* OUTPUT
UTK
TCJ
*/
class Programmer {
    void pritn() {
        System.out.println("UTK");
    }

    void justMine() {
        System.out.println(" RODZIC ");
    }
}

class Author extends Programmer {
    @Override
    void pritn() {
        System.out.println("TCJ");
    }
}

class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Author author = new Author();

        programmer.pritn();
        author.pritn();

        Programmer authorProgrammer = new Author();

        authorProgrammer.pritn();

        programmer.justMine();
        author.justMine();
        authorProgrammer.justMine();
//        Author programmerAuthor = new Programmer(); ILLEGAL
    }
}
