package midterm.payment;

public class PaymentProcess {
    public static void process(Payment payment){
        switch (payment){
                case BankTransferPayment bankTransferPayment -> {System.out.println(bankTransferPayment.getPaymentDetails());
                System.out.println(bankTransferPayment);
            }
            case PayPalPayment payPalPayment -> {

                System.out.println(payPalPayment.getPaymentDetails());
                System.out.println(payPalPayment);
            }
            case CreditCardPayment creditCardPayment -> {
                System.out.println(creditCardPayment.getPaymentDetails());
                System.out.println(creditCardPayment);
            }
        }

    }
}
