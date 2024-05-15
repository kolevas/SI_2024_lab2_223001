package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Item> create(Item... items){
        return new ArrayList<Item>(Arrays.asList(items));
    }

    @Test
    void checkEveryBranch() {
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(null,0));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -1));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("",null,20,0.5f)),0));
        assertTrue(ex.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("","01234",320,0.5f)),0));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("abcde","01234a",320,0.5f)),0));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("abcde","01234",200,-0.5f)),0));

    }

    @Test
    void checkMultipleCondition() {

        assertTrue(SILab2.checkCart(create(new Item("abcde","0777",400,0.5f)),10000));

        assertFalse(SILab2.checkCart(create(new Item("abcde","1777",400,0.5f)),2));

        assertFalse(SILab2.checkCart(create(new Item("abcde","0777",400,-1f)),2));

        assertFalse(SILab2.checkCart(create(new Item("abcde","0777",200,0.5f)),2));

    }
}