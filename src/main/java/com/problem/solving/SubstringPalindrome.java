package com.problem.solving;

public class SubstringPalindrome {

    public long totalPalindrome(int length, String input) {

        char[] inputChar = input.toCharArray();
        int position = 0;
        long totalPalindromes = 0;
        while (position < length) {

            totalPalindromes++;
            int previous = position - 1;
            int next = position + 1;
            int previousElement = 0;
            while (true) {

                if (previous < 0) break;

                if (next > length - 1) break;
                if (inputChar[previous] == inputChar[next]) {
                    if (previousElement != 0 && previousElement != (int) inputChar[previous]) break;
                    previousElement = inputChar[previous];
                    totalPalindromes++;
                    previous--;
                    next++;
                } else break;
            }

            previous = position;
            next = position + 1;
            previousElement = 0;
            while (true) {

                if (next > length - 1) break;
                if (inputChar[previous] == inputChar[next]) {
                    if (previousElement != 0 && previousElement != (int) inputChar[previous]) break;
                    previousElement = inputChar[previous];
                    totalPalindromes++;
                    previous--;
                    next++;
                    if (previous < 0) break;
                } else break;

            }
            position++;
        }
        return totalPalindromes;
    }
}
