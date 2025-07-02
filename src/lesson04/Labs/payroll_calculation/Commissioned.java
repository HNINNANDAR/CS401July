package lesson04.Labs.payroll_calculation;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private double commisssion;
    private double baseSalary;
    private List<Order> orderList;
    private double total_order_amount;

    public Commissioned(String empId, double baseSalary, double commisssion) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commisssion = commisssion;;
        this.orderList = new ArrayList<>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    @Override
    double calcGrossPay(int month, int year) {
        double total_order_amt = 0.0;
        for(Order order: orderList){
            if(order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year)
                total_order_amt += order.getOrderAmount();
        }
        return baseSalary + (commisssion * total_order_amt);
    }
}
