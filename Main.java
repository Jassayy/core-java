import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Amit", 45000));
        employees.add(new Employee("Neha", 65000));
        employees.add(new Employee("Ravi", 55000));
        employees.add(new Employee("Sara", 30000));

        //  Find highest paid employee

        Stream<Employee> stream = employees.stream();

        Employee result = stream.max(Comparator.comparingInt(Employee::getSalary)).orElse(null);

        System.out.println(result.getName());

        //  Print employees earning >= 50000

        List<Employee> list = employees.stream().filter(e -> e.getSalary() >= 50000).collect(Collectors.toList());

        for (Employee e : list) {
            System.out.println(e.getName());
        }

    }
}
