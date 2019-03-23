package com.problem.solving;

import java.util.Arrays;

public class MakingAnagrams {

    public int makeAnagrams(String a, String b) {

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        int deleteCount = 0;

        int aIterator = 0;
        int bIterator = 0;
        while (true) {

            if (aIterator == aChars.length) {
                deleteCount = deleteCount + bChars.length - bIterator;
                break;
            }
            if (bIterator == bChars.length) {
                deleteCount = deleteCount + aChars.length - aIterator;
                break;
            }
            if ((int) aChars[aIterator] > (int) bChars[bIterator]) {
                deleteCount++;
                bIterator++;

            } else if ((int) aChars[aIterator] < (int) bChars[bIterator]) {
                deleteCount++;
                aIterator++;

            } else if ((int) aChars[aIterator] == (int) bChars[bIterator]) {

                if (aIterator < aChars.length) aIterator++;
                if (bIterator < bChars.length) bIterator++;
            }
        }
        return deleteCount;
    }
}
