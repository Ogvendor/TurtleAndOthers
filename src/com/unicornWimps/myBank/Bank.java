package com.unicornWimps.myBank;

public class Bank {

    private int numberOfCustomer;
    private Account[] accounts = new Account[10];


    public void createAccountFor(String accountName, String Pin) {
        Account account = new Account((numberOfCustomer + 1) +"", accountName, Pin);
        accounts[numberOfCustomer ] = account;
       numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Account findAccount(String accountNumber) {
        for(Account account : accounts){
            if(account.getNumber().equals(accountNumber))
                return account;
        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
       Account account = findAccount(accountNumber);
       account.deposit(amount);
    }

    public Account withdraw(int amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount,account.getPin());
        return account;
    }
}
