package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class MakingAnagramsTest {

    MakingAnagrams makingAnagrams = new MakingAnagrams();

    @Test
    public void testMakeAnagrams() {

        String a = "cdfghi";
        String b = "cdefgi";

        int expectedResult = 2;
        int actualResult = makingAnagrams.makeAnagrams(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
