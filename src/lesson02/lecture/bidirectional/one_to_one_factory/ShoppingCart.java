package lesson02.lecture.bidirectional.one_to_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private Customer customer;
    ShoppingCart(){
        items = new ArrayList<>();
    }
    public void setCustomer(Customer customer){
        if(this.customer == null)
            this.customer = customer;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                ", customer=" + customer +
                '}';
    }
}
