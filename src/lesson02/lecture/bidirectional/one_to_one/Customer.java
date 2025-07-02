package lesson02.lecture.bidirectional.one_to_one;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;
    public Customer(String customerName){
        this.customerName = customerName;
        this.shoppingCart = new ShoppingCart(this); //pass current customer obj
    }
    public String getCustomerName(){
        return customerName;
    }
    public ShoppingCart getShoppingCart(){
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
