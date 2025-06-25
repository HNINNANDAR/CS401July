package Lesson2.lecture.unidirectional.one_to_many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private List<Order> orders;
    public Customer(String customerName){
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }
    public Order addOrder(){
        Order order = new Order(LocalDate.now());
        orders.add(order);
        return order;
    }
    public String getCustomerName(){
        return customerName;
    }
    public List<Order> getOrders(){
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", orders=" + orders +
                '}';
    }
}
