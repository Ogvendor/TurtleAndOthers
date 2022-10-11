package com.unicornWimps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SalesTest {
    private SalesPerson john;
    private Item iphone;

    private Item[] itemsSold = new Item[1];

    @BeforeEach
    void setUp(){
        john = new SalesPerson();
        iphone = new Item(1000);
        itemsSold[0] = iphone;
        //john.setSoldItems(itemsSold);
        //Item[] itemsSold = new Item[5];
    }
    @Test
    public void addItem(){
        assertNull(john.getSoldItems());
        itemsSold[0] = iphone;
        john.setSoldItems(itemsSold);
        assertEquals(1,john.getSoldItems().length);
    }
    @Test
    public void calculateEarnings(){
        assertEquals(1,john.getSoldItems().length);
        Item itemSold = john.getSoldItems()[10];
    }

}
