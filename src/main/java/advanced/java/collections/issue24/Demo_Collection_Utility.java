package advanced.java.collections.issue24;

import java.util.*;

 class Demo_Collection_Utility {

     private static final Employee employee = null;

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(31, 87, 22, 45, 12, 98, 3, 6, 7);

        Integer max = Collections.max(listNumbers);

        System.out.println("Maximum number: " + max);
        List<String> listCities = Arrays.asList("London", "Paris", "New York",
                "Washington", "Tokyo", "Rio De Janero", "Bangalore");

        /*Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };*/

        /*Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();*/



        Comparator<String> comparator = Comparator.comparingInt(String::length);


        String max2 = Collections.max(listCities, comparator);

        System.out.println("Most-letter city name: " + max2);

        Integer min = Collections.min(listNumbers);

        System.out.println("Minimum number: " + min);

        List<Employee> listEmployees = new ArrayList<>();

        listEmployees.add(new Employee("Tom", 40000));
        listEmployees.add(new Employee("Adam", 60000));
        listEmployees.add(new Employee("Jim", 70000));
        listEmployees.add(new Employee("Dane", 35000));
        listEmployees.add(new Employee("Jack", 56000));
        listEmployees.add(new Employee("Carol", 67000));

        Comparator<Employee> comparatorEmp = Comparator.comparing(Employee::getSalary);

        Employee minpaid = Collections.min(listEmployees,comparatorEmp );

        System.out.println("Least paid employee: " + minpaid);

        Employee jim = new Employee("Tomi", 10000);
        listEmployees.add(jim);

        Collections.sort(listEmployees, comparatorEmp);

        int index = Collections.binarySearch(listEmployees,jim,comparatorEmp);

        if (index >= 0) {
            jim = listEmployees.get(index);
            System.out.println("Found employee: " + jim);
        }
        System.out.println(listEmployees);

        float[] floats = {12.33f, 0.54f, 4.98f, 220.68f, 10.10f, 19.99f, 25.55f, 20.32f};

        System.out.println("Before sort: " + Arrays.toString(floats));

        Arrays.sort(floats, 0, 3);

        System.out.println("After sort: " + Arrays.toString(floats));
    }


}
