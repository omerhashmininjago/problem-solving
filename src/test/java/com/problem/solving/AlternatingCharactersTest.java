package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {

    AlternatingCharacters alternatingCharacters = new AlternatingCharacters();

    @Test
    public void testAlternateCharacter() {

        String ab = "BBBBB";
        int expectedResult = 4;
        int actualResult = alternatingCharacters.alternateCharacter(ab);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAlternateCharacterTwo() {

        String ab = "AABAAB";
        int expectedResult = 2;
        int actualResult = alternatingCharacters.alternateCharacter(ab);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAlternateCharacterThree() {

        String ab = "ABBABBAA";
        int expectedResult = 3;
        int actualResult = alternatingCharacters.alternateCharacter(ab);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
