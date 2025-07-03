package midterm.lesson2_practise.one_to_one;

public class Customer {
    private String name;
    private ShoppingCart shoppingCart;

    public Customer(String name) {
        this.name = name;
        this.shoppingCart = new ShoppingCart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if(shoppingCart == null)
            this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
