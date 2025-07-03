package lesson02.lecture.bidirectional.one_to_one_factory;

public class CustomerSC{
    public static Customer createCustomer(String name){
        Customer customer = new Customer(name);
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
        shoppingCart.setCustomer(customer);
        return customer;
    }
}

