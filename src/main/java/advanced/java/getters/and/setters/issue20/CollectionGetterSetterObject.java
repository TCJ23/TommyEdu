package advanced.java.getters.and.setters.issue20;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterObject {
    private List<Person> listPeople = new ArrayList<Person>();


    public void setListPeople(List<Person> list) {
        for (Person aPerson : list) {
            this.listPeople.add((Person) aPerson.clone());
        }
    }
/*  AVOID ---------------------
    public void setListPeople(List<Person> list) {
        this.listPeople = new ArrayList<Person>(list);
    }*/
 /*   AVOID ---------------------
    public List<Person> getListPeople() {
        return new ArrayList<Person>(this.listPeople);
    }*/

    public List<Person> getListPeople() {
        List<Person> listReturn = new ArrayList<>();
        for (Person aPerson : this.listPeople
                ) {
            listReturn.add((Person) aPerson.clone());
        }
        return listReturn;
    }

    public static void main(String[] args) {
        CollectionGetterSetterObject app = new CollectionGetterSetterObject();

        List<Person> list1 = new ArrayList<Person>();
        list1.add(new Person("Peter"));
        list1.add(new Person("Alice"));
        list1.add(new Person("Mary"));

        app.setListPeople(list1);

        System.out.println("List 1: " + list1);

        list1.get(2).setName("Maryland");

        List<Person> list2 = app.getListPeople();
        System.out.println("List 2: " + list2);

        list1.get(0).setName("Peter Crouch");

        List<Person> list3 = app.getListPeople();
        System.out.println("List 3: " + list3);

    }
}

/* from Javadoc of the clone() method of ArrayList class:
        public Object clone()
Returns a shallow copy of this ArrayList instance. (The elements themselves are not copied.)*/
class Person {
    private String name;

    /* IMPLEMENT CLONE METHOD  */
    @Override
    public Object clone() {
        Person aClone = new Person(this.name);
        return aClone;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
