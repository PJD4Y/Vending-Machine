package com.techelevator.view;

import com.techelevator.Coinbox;
import com.techelevator.Item;
import com.techelevator.VendingMachineCLI;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Map;

public class CoinboxTest {
    Coinbox coinbox = new Coinbox();

    @Test

    public void fedMoney () {

        BigDecimal testFeed = new BigDecimal (10);

        BigDecimal expected = new BigDecimal (10);

        BigDecimal result = coinbox.feedMoney(testFeed);

        Assert.assertTrue(expected.compareTo(result) == 0);

    }

    @Test
    public void zero () {

        BigDecimal testFeed = new BigDecimal (0);

        BigDecimal expected = new BigDecimal (0);

        BigDecimal result = coinbox.feedMoney(testFeed);

        Assert.assertTrue(expected.compareTo(result) == 0);
    }

    @Test
    public void negativeNumber () {

        BigDecimal testFeed = new BigDecimal (-1);

        BigDecimal expected = new BigDecimal (0);

        BigDecimal result = coinbox.feedMoney(testFeed);

        Assert.assertTrue(expected.compareTo(result) == 0);
    }

}

//    @Test
//
//    public void dispense () {
//
//        Map<String, Item> dispensedItem = coinbox.dispenseItem(new String("A1"));
//
//        String expected = "Here's your Potato Crisps: Crunch Crunch, It's Yummy! ";
//
//        String result = coinbox.dispenseItem(VendingMachineCLI.main(dispensedItem), "Potato Crisps");
//    }


