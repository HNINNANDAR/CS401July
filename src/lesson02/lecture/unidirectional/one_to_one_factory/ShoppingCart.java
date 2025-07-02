package lesson02.lecture.unidirectional.one_to_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private ShoppingCart(){
        items = new ArrayList<>();
    }
    //cusotmer must hav the association with shopping cart
    public static void createShoppingCart(Customer customer){
        if(customer == null) throw new IllegalArgumentException("Customer is null");
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
    }
    public void addItems(Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }
}
