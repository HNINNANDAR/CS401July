package lesson05.Labs.prob4.extpackage;

import java.time.LocalDate;

import lesson05.Labs.prob4.Customer;
import lesson05.Labs.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
