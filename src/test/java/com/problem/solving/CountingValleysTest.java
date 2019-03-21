package com.problem.solving;

import com.problem.solving.countingValleys.CountingValleys;
import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {

    CountingValleys countingValleys = new CountingValleys();

    @Test
    public void testCountingValleys() {

        int expectedResult = 1;
        int actualResult = countingValleys.countingValleys(8, "UDDDUDUU");

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountingValleysTwo() {

        int expectedResult = 2;
        int actualResult = countingValleys.countingValleys(12, "DDUUDDUDUUUD");

        Assert.assertEquals(expectedResult, actualResult);
    }
}
