package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class LeftRotationTest {

    LeftRotation leftRotation = new LeftRotation();

    @Test
    public void testRotateLeft() {

        int[] arr = {1, 2, 3, 4, 5};
        int expectedResult[] = {5, 1, 2, 3, 4};

        int actualResult[] = leftRotation.rotateLeft(arr, 4);
        Assert.assertEquals(expectedResult[0], actualResult[0]);
        Assert.assertEquals(expectedResult[1], actualResult[1]);
        Assert.assertEquals(expectedResult[2], actualResult[2]);
        Assert.assertEquals(expectedResult[3], actualResult[3]);
        Assert.assertEquals(expectedResult[4], actualResult[4]);

    }

}
