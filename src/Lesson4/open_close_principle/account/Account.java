package Lesson4.open_close_principle.account;

public abstract class Account {
    private String accNumber;
    private double balance;
    private String ownerName;

    abstract public double getBalance();

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
