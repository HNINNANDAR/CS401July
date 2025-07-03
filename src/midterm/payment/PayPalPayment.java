package midterm.payment;

public final class PayPalPayment implements Payment{
    private String email;
    private String transactionId;

    public PayPalPayment(String email, String transactionId) {
        this.email = email;
        this.transactionId = transactionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String getPaymentDetails() {
        return "Paid via PayPal: " + email;
    }

    @Override
    public String toString() {
        return "PayPalPayment{" +
                "email='" + email + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
