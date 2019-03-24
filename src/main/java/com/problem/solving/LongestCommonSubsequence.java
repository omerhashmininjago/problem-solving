package com.problem.solving;

import java.lang.reflect.Array;

public class LongestCommonSubsequence {

    public int lcs(String a, String b) {

        char[] firstChars = a.toCharArray();
        char[] secondChars = b.toCharArray();
        return searchLcs(firstChars, secondChars, firstChars.length, secondChars.length);
    }

    private int searchLcs(char[] a, char[] b, int aSize, int bSize) {
        if (aSize == 0 || bSize == 0) {
            return 0;
        }
        if (a[aSize - 1] == b[bSize - 1]) {

            return 1 + searchLcs(a, b, aSize - 1, bSize - 1);
        } else {
            return max(searchLcs(a, b, aSize - 1, bSize), searchLcs(a, b, aSize, bSize - 1));
        }
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
