package lesson11.InClassExercise.terminal_operation.toList_terminal;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(new Employee[]{
                new Employee("Hnin", 2300.90),
                new Employee("Nandar", 3000.90),
                new Employee("Hnin", 5300.90)
        });
        DoubleSummaryStatistics employeeStream = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Summary Statistics: " + employeeStream);
        System.out.println("Min Salary: " + employeeStream.getMin());
        System.out.println("Max Salary: " + employeeStream.getMax());
        System.out.println("Avg Salary: " + employeeStream.getAverage());

        //same result as above
        System.out.println(
                employeeList.stream()
                        .map(e -> e.getSalary())
                        .collect(Collectors.summarizingDouble(new ToDoubleFunction<Double>() {
                            @Override
                            public double applyAsDouble(Double value) {
                                return value;
                            }
                        })));

        //lambda
        System.out.println(
                employeeList.stream()
                        .map(e -> e.getSalary())
                        .collect(Collectors.summarizingDouble(value -> value)));

        //maptoDouble
        //without using collect
        System.out.println(
                employeeList.stream()
                        .map(e -> e.getSalary())
                        .mapToDouble(value -> value)
                        .summaryStatistics()
        );

        //find smallest name based on no of letters and chars
        //find largest name based on no of letters and chars
        //find average
        //find the no of names
        System.out.println("Int get the name length: ");
        System.out.println(
                employeeList.stream().map(data -> data.getNameLength())
                        .mapToInt(data -> data)
                        .summaryStatistics()
        );

    }


}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getNameLength(){
        return name.length();
    }
}
