package midterm.payment;

public sealed interface Payment permits BankTransferPayment, CreditCardPayment, PayPalPayment {
    String getPaymentDetails();
}
