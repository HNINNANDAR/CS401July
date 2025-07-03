package midterm.payment.main;

import midterm.payment.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Payment bankTransferPayment = new BankTransferPayment("77899087","R001");
        Payment payPalPayment = new PayPalPayment("nandar@email.com", "T0000001");
        Payment creditCardPayment = new CreditCardPayment("890889087","Thae", LocalDate.of(2025,7,1));
        PaymentProcess.process(payPalPayment);
        PaymentProcess.process(creditCardPayment);
        PaymentProcess.process(bankTransferPayment);
    }
}
