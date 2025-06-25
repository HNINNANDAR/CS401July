package Lesson2.lecture.unidirectional.one_to_one_factory;

import java.lang.reflect.Constructor;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;
    public Customer(String customerName){
        this.customerName = customerName;
        ShoppingCart.createShoppingCart(this);
    }
    public void setShoppingCart(ShoppingCart shoppingCart){
        if(shoppingCart != null)
            this.shoppingCart = shoppingCart;
    }
    public ShoppingCart getShoppingCart(){
        return shoppingCart;
    }
}
