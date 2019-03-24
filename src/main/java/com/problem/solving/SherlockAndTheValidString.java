package com.problem.solving;

import java.util.Arrays;

public class SherlockAndTheValidString {

    public String isStringValid(String input) {

        if (input.isEmpty()) return "NO";

        char[] chars = input.toCharArray();

        int[] letters = new int[26];
        for (int i = 0; i < input.length(); i++) {
            letters[input.charAt(i) - 'a']++;
        }
        Arrays.sort(letters);
        int i = 0;
        while (letters[i] == 0) {
            i++;
        }
//System.out.println(Arrays.toString(letters));
        int min = letters[i];   //the smallest frequency of some letter
        int max = letters[25]; // the largest frequency of some letter

        if (min == max) return "YES";

        String ret = "NO";
        if (min == max) ret = "YES";
        else {
            // remove one letter at higher frequency or the lower frequency
            if (((max - min == 1) && (max > letters[24])) ||
                    (min == 1) && (letters[i + 1] == max))
                ret = "YES";
        }
        return ret;

    }
}
