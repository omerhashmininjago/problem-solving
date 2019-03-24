package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class RansomNotesTest {

    RansomNotes ransomNotes = new RansomNotes();

    @Test
    public void checkMagazine() {
        String[] magazine = {"give","me","one","grand","today","night"};
        String[] note = {"give","one","grand","today"};

        String expectedResult ="Yes";
        String actualResult = ransomNotes.checkMagazine(magazine,note);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
