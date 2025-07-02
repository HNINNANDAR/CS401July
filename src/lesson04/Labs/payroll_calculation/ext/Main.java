package lesson04.Labs.payroll_calculation.ext;

import lesson04.Labs.payroll_calculation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hourly employee_hourly = new Hourly("E01",23.00, 4);
        Salaried employee_salaried = new Salaried("E02", 250000.00);

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("O01", LocalDate.of(2022,9,23), 100));
        orderList.add(new Order("O02", LocalDate.of(2023,12,13), 500));
        orderList.add(new Order("O01", LocalDate.of(2025,2,5), 50));

        Commissioned employee_commissioned = new Commissioned("E03", 12000, 0.05);
        List<Employee> employees = List.of(employee_hourly, employee_salaried, employee_commissioned);
        for (Order order : orderList) {
            employee_commissioned.addOrder(order);
        }


        for(Employee employee: employees){
           employee.print();
           Paycheck paycheck = employee.calcCompensation(12,2023);
           paycheck.print();
           System.out.println("---------------------");
        }

    }
}
