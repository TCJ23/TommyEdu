package advanced.java.collections.issue24;

import java.util.*;

public class Demo_NavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> setNumbers1 = new TreeSet<>();
        setNumbers1.addAll(Arrays.asList(4, 8, 3, 9, 1, 6, 4, 5, 3, 2, 7, 8, 0));

        NavigableSet<Integer> setNumbers2 = setNumbers1.descendingSet();

        System.out.println("Set Numbers 1: " + setNumbers1);
        System.out.println("Set Numbers 2: " + setNumbers2);

        NavigableSet<String> setFruits = new TreeSet<>();

        setFruits.add("Banana");
        setFruits.add("Apple");
        setFruits.add("Orange");
        setFruits.add("Grape");
        setFruits.add("Mango");

        System.out.println("Set Fruits: " + setFruits);

        Iterator<String> descIterator = setFruits.descendingIterator();

        System.out.print("Fruits by descending order: ");

        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + ", ");
        }
        NavigableSet<Employee> setEmployees = new TreeSet<>(new EmployeeComparator());

        setEmployees.add(new Employee("Tom", 80000));
        setEmployees.add(new Employee("Jack", 35000));
        setEmployees.add(new Employee("Jim", 62500));
        setEmployees.add(new Employee("Peter", 58200));
        setEmployees.add(new Employee("Mary", 77000));
        setEmployees.add(new Employee("Jane", 69500));
        setEmployees.add(new Employee("David", 54000));
        setEmployees.add(new Employee("Sam", 82000));

        System.out.println("Employees: " + setEmployees);

        Employee Tom = new Employee("Tom", 80000);

        Employee emp1 = setEmployees.higher(Tom);

        if (emp1 != null) {
            System.out.println("The employee whose salary > Tom: " + emp1);
        }
        Employee emp2 = setEmployees.lower(Tom);

        if (emp2 != null) {
            System.out.println("The employee whose salary < Tom: " + emp2);
        }
        Employee emp3 = setEmployees.ceiling(new Employee(60000));

        if (emp3 != null) {
            System.out.println("The employee whose >= 60000: " + emp3);
        }
        Employee emp4 = setEmployees.floor(new Employee(40000));

        if (emp4 != null) {
            System.out.println("The employee whose <= 40000: " + emp4);
        }

        SortedSet<Employee> highPaidEmployees = setEmployees.tailSet(new Employee(7000));
        System.out.println("High paid employees: " + highPaidEmployees);

        SortedSet<Employee> lowPaidEmployees = setEmployees.headSet(new Employee(60000));
        System.out.println("Low paid employees: " + lowPaidEmployees);

        SortedSet<Employee> goodPaidEmployees = setEmployees.subSet(new Employee(60000), new Employee(70000));
        System.out.println("Good paid employees: " + goodPaidEmployees);
    }
}

class Employee {
    String name;
    int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return this.name + "-" + salary;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSalary() {
        return new Integer(this.salary);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee another = (Employee) obj;
            if (this.name.equals(another.name)
                    && this.salary == another.salary) {
                return true;
            }
        }

        return false;
    }

    public int hashCode() {
        return 31 * name.hashCode() + salary;
    }
}

class EmployeeComparator implements Comparator<Employee> {

    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary().compareTo(emp2.getSalary());
    }
}