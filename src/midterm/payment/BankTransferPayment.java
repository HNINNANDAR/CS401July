package midterm.payment;

public final class BankTransferPayment implements Payment{
    private String bankAccount;
    private String routingNumber;

    public BankTransferPayment(String bankAccount, String routingNumber) {
        this.bankAccount = bankAccount;
        this.routingNumber = routingNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    @Override
    public String getPaymentDetails() {
        return "Transferred from account: " + bankAccount.substring(3);
    }

    @Override
    public String toString() {
        return "BankTransferPayment{" +
                "bankAccount='" + bankAccount + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                '}';
    }
}
