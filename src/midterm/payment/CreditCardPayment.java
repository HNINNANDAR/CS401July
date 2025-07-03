package midterm.payment;

import java.time.LocalDate;

public final class CreditCardPayment implements Payment{
    private String cardNumber;
    private String cardHolder;
    private LocalDate expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String getPaymentDetails() {
        return "Paid with card ending " + cardNumber.substring(3);
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
