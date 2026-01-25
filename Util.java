import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class Util {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Jas", "IT", 2500000));
        list.add(new Employee(2, "Aman", "HR", 650000));
        list.add(new Employee(3, "Riya", "Finance", 820000));
        list.add(new Employee(4, "Karan", "IT", 1450000));
        list.add(new Employee(5, "Neha", "HR", 720000));
        list.add(new Employee(6, "Arjun", "Finance", 1200000));
        list.add(new Employee(7, "Simran", "IT", 980000));
        list.add(new Employee(8, "Rahul", "Marketing", 540000));
        list.add(new Employee(9, "Pooja", "Marketing", 610000));
        list.add(new Employee(10, "Dev", "IT", 1800000));
        list.add(new Employee(11, "Isha", "Finance", 2000000));

        // get employees with IT dep
        List<String> res = list.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(res);

        // find emp with salary abv 1000000 and sort them by salary
        List<String> l = list.stream()
                .filter(e -> e.getSalary() > 1000000)
                .peek(e -> System.out.println(e.getName() + ":" + e.getSalary()))
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(l);

        String e = list.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(i -> i.getName())
                .orElse(null);

        System.out.println(e);

        // increase salary of all HR employees by 10% and collect in a list

        List<Double> list2 = list.stream()
                .filter(i -> i.getDepartment().equals("HR"))
                .map(i -> i.getSalary() + (0.10) * i.getSalary())
                .collect(Collectors.toList());

        System.out.println(list2);

        // or

        List<Employee> llist3 = list.stream()
                .filter(i -> i.getDepartment().equals("HR"))
                .peek(i -> i.setSalary(
                        i.getSalary() * 1.10))
                .collect(Collectors.toList());

        for (Employee i : llist3) {
            System.out.println(i.getName() + " : " + i.getSalary());
        }

        // count number of employees in each department
        // to collect in map -> use Collectors.groupingby
        // Collectors.counting for its count
        Map<String, Long> mp = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));

        System.out.println(mp);

        // group employees by department
        // map -> string and list employee

        Map<String, List<String>> m = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(m);

        // find average salary per department
        // for average we have averagingDouble
        Map<String, Double> avgSalary = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);

        // employee with max salary per department
        Map<String, Employee> maxSalDep = list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparingDouble(
                                                        Employee::getSalary)),
                                        Optional::get)));

        System.out.println(maxSalDep);

        // partition employees into 2 parts with salary more than 100000 and less

        Map<Boolean, List<Employee>> mp1 = list.stream()
                .collect(
                        Collectors.partitioningBy(
                                i -> i.getSalary() >= 1000000)

                );
        System.out.println(mp1);

        // convert list of employees into map integer and string id -> name
        Map<Integer, String> mp2 = list.stream()
                .collect(
                        Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(mp2);
    }
}
