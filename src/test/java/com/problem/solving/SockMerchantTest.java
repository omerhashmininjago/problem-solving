package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {

    SockMerchant sockMerchant = new SockMerchant();

    @Test
    public void testSockMerchant() {

        int expectedResults = 3;
        int[] ar = {10, 20, 20, 10, 10, 50, 20, 10, 30};
        int actualResult = sockMerchant.sockMerchant(9, ar);
        Assert.assertEquals(expectedResults, actualResult);
    }

    @Test
    public void testSockMerchantTwo() {

        int expectedResults = 4;
        int[] ar = {10, 20, 20, 10, 10, 50, 20, 10, 30, 10};
        int actualResult = sockMerchant.sockMerchant(10, ar);
        Assert.assertEquals(expectedResults, actualResult);
    }
}
