package com.unicornWimps.myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    private Account account;
    private Account bankeAccount;

    @BeforeEach
    void setup() {
        account = new Account();
        bankeAccount = new Account("1", "Banke M", "1234");
    }

    @Test
    void accountCanBeCreatedTest() {
        //given that account exists
        //check that account exists
        //check that account balance is zero
        assertNotNull(account);
        assertEquals(0, account.getBalance(""));

    }

    @Test
    public void depositMoney_balanceIncreasesTest() {
        assertEquals(0, bankeAccount.getBalance(""));
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance(""));
    }

    @Test
    void cannotDepositNegativeAmountTest() {
        //given i have an account and balance is zero
        //when i try to deposit -2500
        //check that balance is zero
        assertEquals(0, bankeAccount.getBalance(""));
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance("1234"));
    }

    @Test
    @DisplayName("Getting Balance with invalid pin return zero")
    void getBalanceWithWrongPin_returnZeroTest() {
        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.getBalance("1212");
        assertEquals(0, myBalance);

    }

    @Test
    @DisplayName("Getting Balance with valid pin return real balance")
    void getBalanceWithWrongPin_returnRealBalanceTest() {
        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.getBalance("1234");
        assertEquals(2000, myBalance);

    }
    @Test
    void withdrawWorks(){
        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.withdraw(500,"1234");
        assertEquals(1500,myBalance);
    }
    @Test
    @DisplayName("Withdraaw with the right pin works")
    void withdrawWithRightPinWorksTest(){
        //given that i have account and balance is 2000
        //when i try to withdraw 500 with 1234 as pin
        //check that current blance is 1500
        bankeAccount.deposit(2000);
        bankeAccount.withdraw(1000,"1234");
        assertEquals(1000,bankeAccount.getBalance("1234"));
    }
    @Test
    @DisplayName("If pin is wrong withdraw doesn't work")
    void withdrawWithWrongPinDoesNotWorkTest(){
        bankeAccount.deposit(2000);
        bankeAccount.withdraw(1000,"1212");
        assertEquals(2000,bankeAccount.getBalance("1234"));

    }
    @Test
    @DisplayName("If pin is correct and amount exceeds balance, withdraw does not work")
    void withdrawWithRightPinAndHighAmountDoesNotWorkTest(){
        bankeAccount.deposit(2000);
        bankeAccount.withdraw(10000,"1234");
        assertEquals(2000,bankeAccount.getBalance("1234"));
    }



}
