package lesson05.Labs.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomer(String name){
        return new Customer(name);
    }
    public static Order createOrder(Customer customer, LocalDate orderDate){
        Order order = Order.newOrder(customer,orderDate);
        customer.addOrder(order);
        return order;
    }
}
