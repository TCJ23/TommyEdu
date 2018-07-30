package advanced.java.classattributes.issue18;

public class ClassAttributes {
    public static String classVariable = "Hey I'm a Class variable";
    private String instanceVariable = "Hey I'm a Instance variable";

    private static void metodaStatyczna() {
        System.out.println("jestem statyczną metodą - nie potrzebuje obiektu");
    }

    void metodaInstancji() {
        System.out.println("jestem w ramach pakietu - najpierw stwórz obiekt ");
    }

    public String getInstanceVariable() {
        return instanceVariable;
    }

    public static void main(String[] args) {
        System.out.println(classVariable);
        System.out.println("Must create object! and call it's getter \n" + new ClassAttributes().getInstanceVariable());
        metodaStatyczna();
//        System.out.println("Metoda default package - metoda instancji" + new ClassAttributes().metodaInstancji());
        ClassAttributes classAttributes = new ClassAttributes();
        classAttributes.metodaInstancji();
    }
}
