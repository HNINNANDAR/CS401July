package Lesson2.lecture.bidirectional.one_to_one_factory;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;
    Customer(String customerName){
        this.customerName = customerName;
    }
    public void setShoppingCart(ShoppingCart shoppingCart){
        //only when shopping cart is not null
        if(this.shoppingCart == null)
            this.shoppingCart = shoppingCart;
    }
    public ShoppingCart getShoppingCart(){
        return shoppingCart;
    }
    public String getCustomerName(){
        return customerName;
    }
}
