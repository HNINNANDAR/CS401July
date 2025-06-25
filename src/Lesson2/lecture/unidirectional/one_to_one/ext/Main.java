package Lesson2.lecture.unidirectional.one_to_one.ext;

import Lesson2.lecture.unidirectional.one_to_one.Customer;
import Lesson2.lecture.unidirectional.one_to_one.Item;
import Lesson2.lecture.unidirectional.one_to_one.ShoppingCart;

public class Main {
    public static void main(String[] args){
        //create a customer
        //creates an associated shoppingcart
        // one-to-one
        Customer customer = new Customer("Ei Thae");
        ShoppingCart shoppingCart =  customer.getShoppingCart();
        shoppingCart.addItems(new Item("Apple"));
        shoppingCart.addItems(new Item("Orange"));
        shoppingCart.addItems(new Item("Water"));

        System.out.println(shoppingCart.getItems() + " added by "+ customer.getCustomerName());



    }
}
