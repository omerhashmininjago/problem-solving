package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class SherlockAndTheValidStringTest {

    SherlockAndTheValidString sherlockAndTheValidString = new SherlockAndTheValidString();

    @Test
    public void testIsStringValid() {

        String input = "aabbcd";
        String expectedResult = "No";
        String actualResult = sherlockAndTheValidString.isStringValid(input);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testIsStringValidTwo() {

        String input = "aabbccddeefghi";
        String expectedResult = "No";
        String actualResult = sherlockAndTheValidString.isStringValid(input);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testIsStringValidThree() {

        String input = "abcdefghhgfedecba";
        String expectedResult = "Yes";
        String actualResult = sherlockAndTheValidString.isStringValid(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
