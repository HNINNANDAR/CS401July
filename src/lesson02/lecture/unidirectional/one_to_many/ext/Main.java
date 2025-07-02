package lesson02.lecture.unidirectional.one_to_many.ext;

import lesson02.lecture.unidirectional.one_to_many.Customer;
import lesson02.lecture.unidirectional.one_to_many.Item;
import lesson02.lecture.unidirectional.one_to_many.Order;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ei Thae");
        Order order = customer.addOrder();
        order.addItems(new Item("Orange"));
        order.addItems(new Item("Butter"));
        order.addItems(new Item("Pear"));
        Order order1 = customer.addOrder();
        order1.addItems(new Item("Pencil"));
        order1.addItems(new Item("Book"));
        order1.addItems(new Item("Correction"));
        System.out.println(order.getItems() + " added the items." +"\n");
        System.out.println(customer.getCustomerName() + " has " + customer.getOrders().size() + " orders"+"\n");
        System.out.println(customer.getOrders() + " added the orders."+"\n");
        System.out.println(customer);
    }
}
