package midterm.lesson2_practise.one_to_one;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }
    public void addItem(Item item){
        itemList.add(item);
    }
    public List<Item> getItemList(){
        return itemList;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemList=" + itemList +
                '}';

    }
}
