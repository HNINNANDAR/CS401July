package lesson10.java_7e_fp;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
//        return Double.compare(o1.getSalary(), o2.getSalary());
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
