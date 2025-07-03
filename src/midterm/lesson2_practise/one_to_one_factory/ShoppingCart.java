package midterm.lesson2_practise.one_to_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public static ShoppingCart createShoppingCart(Customer customer){
        if(customer == null) throw new IllegalArgumentException("Cus is null.");
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
        return shoppingCart;
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
