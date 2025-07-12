package final_exam.prob9;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 28, 53000),
                new Employee("Bob", "Engineering", 35, 76000),
                new Employee("Charlie", "HR", 41, 68000),
                new Employee("David", "Engineering", 29, 82000),
                new Employee("Eva", "Sales", 30, 49000),
                new Employee("Frank", "Engineering", 45, 99000),
                new Employee("Grace", "Sales", 27, 51000),
                new Employee("Heidi", "Engineering", 32, 75000)
        );
        IntSummaryStatistics salarySummaryStatistic = employees.stream().
                mapToInt(employee -> employee.getSalary()).summaryStatistics();
        IntSummaryStatistics ageSummaryStatistic = employees.stream()
                .mapToInt(employee -> employee.getAge())
                .summaryStatistics();
        System.out.println("Total no of emp: " + employees.stream().count());
        System.out.println("Average salary: " + salarySummaryStatistic.getAverage());
        System.out.println("Highest salary: " + salarySummaryStatistic.getMax());
        System.out.println("Lowest salary: " + salarySummaryStatistic.getMin());
        System.out.println("Total salary: " + salarySummaryStatistic.getSum());
        System.out.println("Average age: " + ageSummaryStatistic.getAverage());
    }
}
