package com.problem.solving;

import org.apache.commons.lang3.StringUtils;

public class RepeatedString {  // Complete the repeatedString function below.

    public long repeatedString(String s, long n) {

        if (StringUtils.isEmpty(s)) return 0;

        int stringLength = s.length();
        long fullStringRepeat = n / stringLength;
        long substringStringRepeat = n % stringLength;

        long totalAs = 0;
        for (int i = 0; i < stringLength; i++) {
            totalAs = s.charAt(i) == 'a' ? totalAs + 1: totalAs;
        }
        totalAs = totalAs * fullStringRepeat;

        for (int i = 0; i < substringStringRepeat; i++) {
            totalAs = s.charAt(i) == 'a' ? totalAs + 1: totalAs;
        }
        return totalAs;
    }

}
