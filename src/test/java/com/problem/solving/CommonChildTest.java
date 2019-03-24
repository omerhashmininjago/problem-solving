package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class CommonChildTest {

    CommonChild commonChild = new CommonChild();

    @Test
    public void testCommonChild() {

        String strOne = "HARRY";
        String strTwo = "SALLY";

        int expectedResult = 2;
        int actualResult = commonChild.commonChild(strOne, strTwo);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCommonChildTwo() {

        String strOne = "SHINCHAN";
        String strTwo = "NOHARAAA";

        int expectedResult = 3;
        int actualResult = commonChild.commonChild(strOne, strTwo);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCommonChildThree() {

        String strOne = "ABCDEF";
        String strTwo = "FBDAMN";

        int expectedResult = 4;
        int actualResult = commonChild.commonChild(strOne, strTwo);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
