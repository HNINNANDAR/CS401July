package lesson02.lecture.bidirectional.one_to_one;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    //as the Customer owns the relationship, Shopping cart should be package level
    private Customer customer;
    ShoppingCart(Customer customer){
        this.items = new ArrayList<>();
        this.customer = customer; //now shopping cart is associated with customer
    }
    public void addItems(Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
