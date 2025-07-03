package midterm.lesson2_practise.one_to_one_factory.ext;

import midterm.lesson2_practise.one_to_one_factory.Customer;
import midterm.lesson2_practise.one_to_one_factory.Item;
import midterm.lesson2_practise.one_to_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nandar");
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItem(new Item("Apple"));
        shoppingCart.addItem(new Item("Orange"));
        shoppingCart.addItem(new Item("Lemon"));
        System.out.println(customer);

    }

}
