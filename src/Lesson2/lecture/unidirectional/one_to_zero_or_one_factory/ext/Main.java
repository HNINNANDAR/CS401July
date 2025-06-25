package Lesson2.lecture.unidirectional.one_to_zero_or_one_factory.ext;

import Lesson2.lecture.unidirectional.one_to_zero_or_one_factory.Customer;
import Lesson2.lecture.unidirectional.one_to_zero_or_one_factory.Item;
import Lesson2.lecture.unidirectional.one_to_zero_or_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args){
        //no association of shopping cart
        Customer customer = new Customer("Ei Thae");
        //customer can be without shoppingCart
        //shoppingCart is created separately and associate with customer when the following
        //method is called.
        ShoppingCart shoppingCart = ShoppingCart.createShoppingCart(customer);
        shoppingCart.addItems(new Item("Apple"));
        shoppingCart.addItems(new Item("Banana"));
        shoppingCart.addItems(new Item("Orange"));

        System.out.println(shoppingCart.getItems() + " added. ");

    }
}
