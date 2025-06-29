package Lesson4.open_close_principle.account;

public class CheckingAccount extends Account {
    private double overdraftLimit;
    private double monthlyFee;
    private String debitCardNumber;

    @Override
    public double getBalance() {
        return 0;
    }
}
