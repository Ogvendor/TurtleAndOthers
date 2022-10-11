package com.unicornWhimps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StoreTest {
    private StoreCustomer vendor;
    private StoreCustomer mojiza;

    @BeforeEach
    public void setUp(){
        vendor = new StoreCustomer();
        vendor.setAccountNumber(1);
        vendor.setBalance(1000);
        vendor.setCreditLimit(5000);
        vendor.setTotalItemsCharged(3000);
        vendor.setTotalCreditApplied(4000);

        mojiza = new StoreCustomer(2, 111, 345, 254, 56);
    }

    @Test
    public void calculateBalance(){
        int balance = vendor.calculateBalance();
        assertEquals(1000,vendor.getBalance());
    }
    @Test
    public void calculateBalanceWithNegativeBalance(){
    vendor.setBalance(-1000);
    vendor.calculateBalance();
    assertEquals(0,vendor.getBalance());
    }
    @Test
    public void checkCreditLimitExceeded(){
        vendor.calculateBalance();
        boolean exceeded = vendor.isCreditLimitExceeded();
        assertFalse(exceeded);
    }
    @Test
    public void checkCreditLimitExceededWithHighItemsCharged() {
        vendor.calculateBalance();
        vendor.setTotalItemsCharged(15000);
        boolean exceeded = vendor.isCreditLimitExceeded();
        assertFalse(exceeded);
    }
    @Test
    public void main(){
        StoreCustomer[] customers = {vendor,mojiza};
        for(int i = 0;i<customers.length;i++){
            StoreCustomer customer = customers[i];
            customer.calculateBalance();
            System.out.println("Credit Limit is Exceeded");

        }
    }

}
