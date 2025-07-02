package lesson02.lecture.unidirectional.one_to_one;

import lesson02.lecture.bidirectional.one_to_one.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //shopping cart contains a collection of items
    private List<Item> items;
    //package level access
    //shopping cart can oly be created with the customer
    ShoppingCart(){
        items = new ArrayList<Item>();
    }
    public void addItems(Item item){
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }
}
