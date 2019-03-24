package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class SubstringPalindromeTest {

    SubstringPalindrome substringPalindrome = new SubstringPalindrome();

    @Test
    public void testTotalPalindrome() {

        String input = "abcbaba";
        long expectedResult = 10;
        long actualResult = substringPalindrome.totalPalindrome(input.length(), input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTotalPalindromeTwo() {

        String input = "asasd";
        long expectedResult = 7;
        long actualResult = substringPalindrome.totalPalindrome(input.length(), input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTotalPalindromeFour() {

        String input = "aaaa";
        long expectedResult = 10;
        long actualResult = substringPalindrome.totalPalindrome(input.length(), input);

        Assert.assertEquals(expectedResult, actualResult);
    }


}
