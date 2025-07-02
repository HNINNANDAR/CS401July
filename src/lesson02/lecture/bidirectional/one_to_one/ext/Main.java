package lesson02.lecture.bidirectional.one_to_one.ext;

import lesson02.lecture.bidirectional.one_to_one.Customer;
import lesson02.lecture.bidirectional.one_to_one.Item;
import lesson02.lecture.bidirectional.one_to_one.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ei Thae");
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItems(new Item("Orange"));
        shoppingCart.addItems(new Item("Pear"));
        shoppingCart.addItems(new Item("Banana"));

        System.out.println(customer.getCustomerName() + " added " + shoppingCart.getItems());
        System.out.println(customer);


    }
}
