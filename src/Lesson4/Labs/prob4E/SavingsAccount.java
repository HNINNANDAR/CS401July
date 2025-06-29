package Lesson4.Labs.prob4E;

public class SavingsAccount extends Account{
    private String accId;
    private double balance;
    private double interestRate;
    public SavingsAccount(String acctId, double interestRate, double balance) {
        this.balance = balance;
        this.accId = acctId;
        this.interestRate = interestRate;
    }

    @Override
    String getAccount() {
        return accId;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return (getBalance() + (interestRate * getBalance()));
    }
}
