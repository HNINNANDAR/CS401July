package lesson13.InClassExercise.find_max;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    @Override
    public String toString() {
        return "employee";
    }
}
class Manager extends Employee{
    @Override
    public String toString() {
        return "manager";
    }
}
class Execute{
    public static void main(String[] args) {
        Employee[] employees = {new Employee(), new Employee()};
        Manager[] managers = {new Manager(), new Manager()};
        employees = managers; //superclass becomes subclass
        System.out.println(employees[0]);
//        employees[0] = (Manager) new Employee(); //create new super class in sub class is not allowed
        //ArrayStoreException

        List<Employee> empList = new ArrayList<>();
        List<Manager> manList = new ArrayList<>();
//        empList = manList;
    }
}
