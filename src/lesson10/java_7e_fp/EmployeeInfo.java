package lesson10.java_7e_fp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    //sort by name and salary
    static enum SortMethod{
        BYNAME,BYSALARY,BYNAMESALARY
    }
    private SortMethod sortMethod;

    public EmployeeInfo(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }
    public void sort(List<Employee> employees) {
        if (sortMethod == SortMethod.BYNAME) {
            //sort by name
            Collections.sort(employees, new Comparator<Employee>() {
                // new -> some class that implements comparator
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        } else if (sortMethod == SortMethod.BYNAME) {
            //sort by salary
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return (int) (o1.getSalary() - o2.getSalary());
                }
            });
        } else {
            //sort by both
            //closure -> bloc of codes acts as function
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (sortMethod == SortMethod.BYNAME)
                        return o1.getName().compareTo(o2.getName());
                    return (int) (o1.getSalary() - o2.getSalary());

                }
            });
//                @Override
//                public int compare(Employee o1, Employee o2) {
//                    if(o1.getName().compareTo(o2.getName()) == 0)
//                        return (int) (o1.getSalary() - o2.getSalary());
//
//                }
        }
        //lamda expression
        Comparator ob = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (sortMethod == SortMethod.BYNAME)
                    return o1.getName().compareTo(o2.getName());
                return (int) (o1.getSalary() - o2.getSalary());

            }

        };
//        Comparator<Employee> comparator = (Employee o1, Employee o2) -> {
//            if (sortMethod == SortMethod.BYNAME)
//                return o1.getName().compareTo(o2.getName());
//            return (int) (o1.getSalary() - o2.getSalary());
//        };
    }
}

