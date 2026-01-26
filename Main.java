import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Jas", "IT", 3000000));
        employees.add(new Employee(2, "Aman", "HR", 650000));
        employees.add(new Employee(3, "Riya", "Sales", 820000));
        employees.add(new Employee(4, "Karan", "IT", 1450000));
        employees.add(new Employee(5, "Neha", "HR", 720000));
        employees.add(new Employee(6, "Arjun", "Finance", 1200000));
        employees.add(new Employee(7, "Simran", "IT", 980000));
        employees.add(new Employee(8, "Rahul", "Marketing", 540000));
        employees.add(new Employee(9, "Pooja", "Marketing", 610000));
        employees.add(new Employee(10, "Dev", "IT", 1800000));
        employees.add(new Employee(11, "Isha", "Finance", 2000000));

        /*
         * From List<Employee>, get all employee names in uppercase, sorted
         * alphabetically.
         * Count how many employees earn more than 1,000,000
         * Check if any employee belongs to "Marketing".
         * Check if all employees earn more than 50,000.
         * Get a comma-separated string of all employee names.
         */
        System.out.println("Upper case and sort alphabetically:");
        employees.stream()
                .map(e -> e.getName().toUpperCase())
                .sorted()
                .forEach(System.out::println);

        long count = employees.stream()
                .filter(e -> e.getSalary() > 1000000)
                .count();

        System.out.println("Count employees earning more than 1000000 : " + count);

        // boolean question it is
        boolean anyInMarketing = employees.stream()
                .anyMatch(e -> e.getDepartment().equals("Marketing"));

        System.out.println("Employee belonging to marketing: " + anyInMarketing);

        boolean allAbv5Lac = employees.stream()
                .allMatch(e -> e.getSalary() > 500000);
        System.out.println("Employees earn abv 5 lacs?  : " + allAbv5Lac);

        // collect all names with , separated
        String names = employees.stream()
                .map(e -> e.getName())
                .reduce((a, b) -> a + ", " + b)
                .orElse("");
        System.out.println(names);
        // dont do this
        // instead use collectors.joining
        String namesStr = employees.stream()
                .map(e -> e.getName())
                .collect(Collectors.joining(" , "));

        System.out.println(namesStr);

        // get names of all employees from IT department
        System.out.println("Names of employees in IT Department:");
        employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .map(e -> e.getName())
                .forEach(System.out::println);

        // count employees in each department
        Map<String, Long> empCount = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()));
        System.out.println(empCount);

        // check if any employee earns more than 25 lacs
        boolean earnMoreThan25 = employees.stream()
                .anyMatch(e -> e.getSalary() > 2500000);
        System.out.println(earnMoreThan25);

        boolean empInSales = employees.stream()
                .allMatch(e -> !e.getDepartment().equals("Sales"));
        System.out.println(empInSales);

        // get List of employeeIds only
        List<Integer> empIdList = employees.stream()
                .map(e -> e.getId())
                .collect(
                        Collectors.toList());
        System.out.println(empIdList);

        // level 2
        // sort employees by salary ascending and print name + salary
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .map(e -> e.getName() + " : " + e.getSalary())
                .forEach(System.out::println);

        // sort employees by name descending and get top 3 highest paid employees
        System.out.println("Top 3 highest paid emplpyees : ");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(e -> e.getName() + " : " + e.getSalary())
                .forEach(System.out::println);

        // lowest paid employee
        System.out.println("Lowest paid employee: ");
        employees.stream()
                .min(
                        Comparator.comparingDouble(Employee::getSalary))
                .map(e -> e.getName() + " : " + e.getSalary())
                .ifPresent(
                        System.out::println);

        // highest paid employee
        System.out.println("Highest paid emplpyee: ");
        String highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).map(e -> e.getName()).orElse("");
        System.out.println(highestPaid);

        // sort employees alphabetically by name and then by salary
        System.out.println("Employees sorted by name and salary: ");
        employees.stream()
                .sorted(
                        Comparator.comparing(
                                Employee::getName).thenComparing(
                                        Employee::getSalary))
                .map(
                        e -> e.getName() + " : " + e.getSalary())
                .forEach(System.out::println);

        // group employees by department
        System.out.println("Employees grouped by department:");
        Map<String, List<String>> empByDep = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(empByDep);

        // count employees in each department
        Map<String, Long> empCountByDep = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));

        System.out.println(
                empCountByDep);

        // average salary of all employees
        System.out.println("Average salary of all employees:");
        double avgSalary = employees.stream()
                .collect(
                        Collectors.averagingDouble(Employee::getSalary));

        System.out.printf("%.2f", avgSalary);

        System.out.println();

        // get average salary of employees in each department
        System.out.println("Average salary by department: ");
        Map<String, Double> avgSalaryByDep = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(
                                        Employee::getSalary)));

        System.out.println(avgSalaryByDep);

        // get total salary paid by the company
        System.out.println("Total salary paid by the company: ");
        double totalSalary = employees.stream()
                .collect(
                        Collectors.summingDouble(
                                Employee::getSalary));

        System.out.println(totalSalary);

        // partition employees based on salary > 1,000,000
        System.out.println("Partition employees based on salary above 10 lacs : ");
        Map<Boolean, List<String>> partEmp = employees.stream()
                .collect(
                        Collectors.partitioningBy(
                                e -> e.getSalary() > 1000000,
                                Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(partEmp);

        // get department wise highest paid employee
        System.out.println("Department wise highest paid employee: ");
        Map<String, String> highestPaidEmp = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparingDouble(
                                                        Employee::getSalary)),
                                        e -> e.get().getName())));

        System.out.println(highestPaidEmp);

        // get department wise total salary
        System.out.println("Department wise total salary: ");
        Map<String, Double> totalSalaryByDep = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(
                                        Employee::getSalary)));

        System.out.println(totalSalaryByDep);

        // create a map of employee id and employee name
        System.out.println("Map of employee id and employee name : ");
        Map<Integer, String> empIdName = employees.stream()
                .collect(
                        Collectors.toMap(
                                Employee::getId, Employee::getName));

        System.out.println(empIdName);

        // find second highest paid employee
        System.out.println("Second highest paid employee: ");
        String secondHighestPaidEmployee = employees.stream()
                .sorted(
                        Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).map(Employee::getName).findFirst().orElse("");

        System.out.println(secondHighestPaidEmployee);

        // find employee with longest name
        System.out.println("Employee with longest name: ");
        String longestNameEmployee = employees.stream()
                .max(
                        Comparator.comparingInt(e -> e.getName().length()))
                .map(Employee::getName).orElse("");

        System.out.println(longestNameEmployee);

        // check if all employees have salary more than 9 lakhs
        boolean allAbv9Lac = employees.stream().allMatch(e -> e.getSalary() > 900000);
        System.out.println("Employees earn abv 9 lacs? : " + allAbv9Lac);

        // get comma separated names of employees of IT department
        System.out.println("Comma separated names of employees in IT Department: ");
        String itEmpName = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .map(
                        Employee::getName)
                .collect(
                        Collectors.joining(" , "));

        System.out.println(itEmpName);

        // department with maximum employees
        System.out.println("Department with maximum employees: ");
        String maxEmpDep = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");

        System.out.println(maxEmpDep);

        // get department with highest average salary
        System.out.println("Department with highest average salary: ");
        String departmentHighestAvgSalary = employees.stream()
                .collect(
                    Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                    )
                ).entrySet()
                .stream()
               .max(Map.Entry.comparingByValue())
               .map(Map.Entry::getKey).orElse("");

               System.out.println(departmentHighestAvgSalary);
    }
}

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

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
