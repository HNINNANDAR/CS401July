package final_exam.prob3;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        double amount = 456.5;
        if(PaymentProcessor.validateCard("1234567890123456")){
            if(creditCardPayment.processPayment(amount))
                creditCardPayment.printReceipt(amount);
        }
    }
}
