package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class MinimumBribesTest {

    MinimumBribes minimumBribes = new MinimumBribes();

    @Test
    public void testMinimumBribes() {

        int[] queue = {3, 1, 5, 2, 4, 6};
        String expectedResult = "4";

        String actualResult = minimumBribes.minimumBribes(queue);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testMinimumBribesTooChaotic() {

        int[] queue = {3, 5, 1, 2, 4, 6};
        String expectedResult = "Too Chaotic";

        String actualResult = minimumBribes.minimumBribes(queue);
        Assert.assertEquals(expectedResult, actualResult);

    }
}
