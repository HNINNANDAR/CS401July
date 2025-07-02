package lesson02.lecture.unidirectional.one_to_zero_or_one_factory;

public class Customer {
    private String customerName;
    ShoppingCart shoppingCart;
    public Customer(String customerName){
        this.customerName = customerName;
    }
    public ShoppingCart getShoppingCart(){
        return shoppingCart;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setShoppingCart(ShoppingCart shoppingCart){
        if(shoppingCart != null)
            this.shoppingCart = shoppingCart;
    }
}
