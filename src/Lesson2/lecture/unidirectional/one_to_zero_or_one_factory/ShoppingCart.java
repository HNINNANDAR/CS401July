package Lesson2.lecture.unidirectional.one_to_zero_or_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private ShoppingCart(){
        items = new ArrayList<>();
    }
    public static ShoppingCart createShoppingCart(Customer customer){
        if(customer == null) throw new IllegalArgumentException("Customer is null");
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
        return shoppingCart;
    }
    public void addItems(Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }
}
