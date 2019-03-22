package com.problem.solving;


import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    RepeatedString repeatedString = new RepeatedString();

    @Test
    public void testRepeatedString() {
        String s = "aba";
        long n = 10;

        long expectedResult = 7;
        long actualResult = repeatedString.repeatedString(s, n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeatedStringTwo() {
        String s = "a";
        long n = 1000000000;

        long expectedResult = 1000000000;
        long actualResult = repeatedString.repeatedString(s, n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeatedStringThree() {
        String s = "abcac";
        long n = 10;

        long expectedResult = 4;
        long actualResult = repeatedString.repeatedString(s, n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeatedStringFour() {
        String s = "bbbb";
        long n = 10;

        long expectedResult = 0;
        long actualResult = repeatedString.repeatedString(s, n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeatedStringForNull() {
        String s = null;
        long n = 10;

        long expectedResult = 0;
        long actualResult = repeatedString.repeatedString(s, n);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRepeatedStringForEmpty() {
        String s = "      ";
        long n = 10;

        long expectedResult = 0;
        long actualResult = repeatedString.repeatedString(s, n);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
