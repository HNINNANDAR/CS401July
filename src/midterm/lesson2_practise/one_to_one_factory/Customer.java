package midterm.lesson2_practise.one_to_one_factory;

public class Customer {
    private String name;
    private ShoppingCart shoppingCart;

    public Customer(String name) {
        this.name = name;
        ShoppingCart.createShoppingCart(this);
    }

    public String getName() {
        return name;
    }


    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if(this.shoppingCart == null)
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
