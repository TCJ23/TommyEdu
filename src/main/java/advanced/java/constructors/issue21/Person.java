package advanced.java.constructors.issue21;

class Person {
    private String name;
    private boolean mood;
    private int dollars;

    public Person(String name, boolean mood, int dollars) {
        this.name = name;
        this.mood = mood;
        this.dollars = dollars;
        System.out.println("superclass");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mood=" + mood +
                ", dollars=" + dollars +
                '}';
    }
}

class Student extends Person {

    private String degree;

    Student(String name, boolean mood, int dollars) {
        super(name, mood, dollars);
        this.degree = "default";
//        this(name, mood, dollars, "DEF"); // wywołuje 4 argumentowy i nadal działa jak wyowłanie jawne !

    }

    Student(String name, boolean mood, int dollars, String degree) {
        super(name, mood, dollars);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Student{" +
                "degree='" + ((degree == null) ? "brak" : degree) + '\'' +
                '}';
    }
   /*     if (degree == null) {
            return super.toString();
        } else
            return super.toString()
                    + "Student{" +
                    "degree='" + degree + '\'' +
                    '}';
    }*/


    public static void main(String[] args) {
        Student student = new Student("imię", true, 20);
        Student student2 = new Student("imię2", false, 22, "magister");
        System.out.println(student.toString());
        System.out.println(student2.toString());
    }
}