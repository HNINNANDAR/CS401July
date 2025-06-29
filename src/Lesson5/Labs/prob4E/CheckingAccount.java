package Lesson5.Labs.prob4E;

public class CheckingAccount extends Account{
    private String accId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String acctId,double monthlyFee,double balance) {
        this.accId = acctId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
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
        return balance - monthlyFee;
    }
}
