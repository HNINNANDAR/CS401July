package lesson02.lecture.bidirectional.one_to_one_factory;

public class CustomerSC {
    public static Customer createCustomer(String customerName){
        Customer customer = new Customer(customerName);
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
        shoppingCart.setCustomer(customer);
        return customer;
    }
}
