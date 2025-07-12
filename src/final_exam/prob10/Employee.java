package final_exam.prob10;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private Double salary;
    private String managerName;

    public Employee(String name, String department, Double salary, String managerName) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public String getManagerName() {
        return managerName;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 53000.0, "Bob"),
                new Employee("Bob", "HR", 65000.0, null),
                new Employee("Charlie", "Engineering", null, "Diana"),
                new Employee("Diana", "Engineering", 92000.0, null),
                new Employee("Eva", "Sales", 47000.0, "Frank"),
                new Employee("Frank", "Sales", 69000.0, null),
                new Employee("Grace", "Sales", null, "Frank")
        );
        employees.forEach(employee ->
                System.out.println(employee.getName() + " (Manager: " +
                        Optional.ofNullable(employee.getManagerName()).orElse("No Manager") + ")"
                ));

        employees.stream()
                .filter(e -> Optional.ofNullable(e.getSalary()).isEmpty())
                .map(Employee::getName)
                .forEach(name -> System.out.println("Salary is not assigned: " + name));

        //groupBy
        Map<String, Double> avaSalaryByDept = employees.stream()
                .filter(e-> e.getSalary() != null)
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        avaSalaryByDept.forEach((dept, salary) ->
                System.out.println("Department: " + dept +", Average Salary: " + salary));
    }
}
