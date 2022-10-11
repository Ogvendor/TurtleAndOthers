package com.unicornWhimps;

public class StoreCustomer {
    private int accountNumber;
    private int balance;
    private int totalItemsCharged;
    private int totalCreditApplied;
    private int creditLimit;


    public StoreCustomer(int accountNumber, int accountBalance, int totalItems, int totalCredit, int Limit) {
        this.accountNumber = accountNumber;
        balance = accountBalance;
        totalItemsCharged = totalItems;
        totalCreditApplied = totalCredit;
        creditLimit = Limit;


    }
    public StoreCustomer(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public StoreCustomer() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getTotalCreditApplied() {
        return totalCreditApplied;
    }

    public void setTotalCreditApplied(int totalCreditApplied) {
        this.totalCreditApplied = totalCreditApplied;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int calculateBalance() {
        int balance = getBalance() + totalItemsCharged - totalCreditApplied;
        return balance;
    }

    public boolean isCreditLimitExceeded() {
        boolean result = false;
        if (getBalance() > getCreditLimit());
            return result = true;

    }

}

