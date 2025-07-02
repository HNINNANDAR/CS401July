package lesson02.lecture.unidirectional.one_to_one;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    //prevent shopping cart create more than one
    public Customer(String customerName){
        this.customerName = customerName;
        this.shoppingCart = new ShoppingCart();
    }
    public ShoppingCart getShoppingCart(){
        return shoppingCart;
    }
    public String getCustomerName(){
        return customerName;
    }
}
