package lesson02.lecture.bidirectional.one_to_one_factory.ext;

import lesson02.lecture.bidirectional.one_to_one_factory.Customer;
import lesson02.lecture.bidirectional.one_to_one_factory.CustomerSC;
import lesson02.lecture.bidirectional.one_to_one_factory.Item;
import lesson02.lecture.bidirectional.one_to_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Customer customer = CustomerSC.createCustomer("Ei Thae");
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItem(new Item("Blanket"));
        shoppingCart.addItem(new Item("Cup"));
        shoppingCart.addItem(new Item("Sheet"));
        System.out.println(customer.getCustomerName() + " added " + shoppingCart.getItems());

    }
}
