package Lesson4.open_close_principle.account.ext;

import Lesson4.open_close_principle.account.Account;
import Lesson4.open_close_principle.account.CheckingAccount;
import Lesson4.open_close_principle.account.RetirementAccount;
import Lesson4.open_close_principle.account.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Object[] accounts = {
                new SavingAccount(),
                new SavingAccount(),
                new SavingAccount(),
                new CheckingAccount()
        };
        double totalBalance = 0;
        for(Object account: accounts){
            if(account instanceof  SavingAccount savingAccount)
                totalBalance += savingAccount.getBalance();
            if(account instanceof  CheckingAccount checkingAccount)
                totalBalance += checkingAccount.getBalance();
            if(account instanceof  RetirementAccount retirementAccount)
                totalBalance += retirementAccount.getBalance();
        }
        System.out.println("Total Balance: " + totalBalance);

        Account[] myAccounts = {
                new SavingAccount(),
                new SavingAccount(),
                new SavingAccount(),
                new CheckingAccount()
        };
        double totalBalance1 = 0;
        for(Account account: myAccounts){
            totalBalance1 += account.getBalance();
        }
        System.out.println("Total Balance1: " + totalBalance1);


    }
}
