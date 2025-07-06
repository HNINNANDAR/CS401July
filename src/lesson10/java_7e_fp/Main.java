package lesson10.java_7e_fp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Thae", 450000));
        employeeList.add(new Employee("Lay", 150000));
        employeeList.add(new Employee("Zaw", 350000));

//        Collections.sort(employeeList, new EmployeeNameComparator());
//        System.out.println(employeeList);
        //employee doesn't hv the comparable //String has the default comparable// default
        //create comparatoor
        //original collection was sorted

//        Collections.sort(employeeList,
//                new EmployeeSalaryComparator()); // this obj behaves like a fun
//        System.out.println(employeeList);

        EmployeeInfo employeeInfo_sort_name = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
        employeeInfo_sort_name.sort(employeeList);
        System.out.println(employeeInfo_sort_name);

        EmployeeInfo employeeInfo_sort_salary = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
        System.out.println(employeeInfo_sort_salary);

        employeeList.sort(
                (o1,o2) -> Double.compare(o1.getSalary(),o2.getSalary())
        );
        Collections.sort(
                employeeList,
                (o1,o2) -> Double.compare(o1.getSalary(),o2.getSalary()));
    }
}
