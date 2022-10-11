package com.unicornWimps.myBank;

public class Account {

    private String number;
    private String name;
    private String pin;

    private int balance;

    public Account(String accountNumber, String accountName, String accountPin) {
        name = accountName;
        pin = accountPin;
        number = accountNumber;
    }

    public Account() {}


    public int getBalance(String pin){
        if(pin.equals(this.pin))
        return balance;

        return 0;
    }

    public void deposit(int amount) {
        if(amount > 0)
        balance = getBalance("1212")+amount;

    }

    public int withdraw(int amount,String pin) {
        if(amount < balance && pin.equals(this.pin))
       balance = balance - amount;
        return balance;
    }

    private boolean isCorrect(String pin){
        if(pin.equals(this.pin)) return true;
        return false;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }
}
