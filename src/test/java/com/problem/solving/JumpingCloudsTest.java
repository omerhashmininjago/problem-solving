package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class JumpingCloudsTest {

    JumpingClouds jumpingClouds = new JumpingClouds();

    @Test
    public void testJumpingOnClouds() {

        int expectedResult = 3;
        int[] c = {0, 1, 0, 0, 0, 1, 0};
        int actualResult = jumpingClouds.jumpingOnClouds(c);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testJumpingOnCloudsTwo() {

        int expectedResult = 4;
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        int actualResult = jumpingClouds.jumpingOnClouds(c);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testJumpingOnCloudsThree() {

        int expectedResult = 3;
        int[] c = {0, 0, 0, 1, 0, 0};
        int actualResult = jumpingClouds.jumpingOnClouds(c);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
