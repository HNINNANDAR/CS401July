package Lesson2.lecture.unidirectional.one_to_one_factory.ext;

import Lesson2.lecture.unidirectional.one_to_one_factory.Customer;
import Lesson2.lecture.unidirectional.one_to_one_factory.Item;
import Lesson2.lecture.unidirectional.one_to_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args){
        //once customer is created, shopping cart is created
        //one customer has one shopping cart
        Customer customer = new Customer("Thae Lay");
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItems(new Item("apple"));
        shoppingCart.addItems(new Item("orange"));
        System.out.println(shoppingCart.getItems() + " added. ");
    }

}
