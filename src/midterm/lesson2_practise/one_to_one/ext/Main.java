package midterm.lesson2_practise.one_to_one.ext;

import midterm.lesson2_practise.one_to_one.Customer;
import midterm.lesson2_practise.one_to_one.Item;
import midterm.lesson2_practise.one_to_one.ShoppingCart;

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
