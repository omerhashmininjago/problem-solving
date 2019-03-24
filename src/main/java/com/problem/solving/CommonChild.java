package com.problem.solving;

public class CommonChild {

    public int commonChild(String a, String b) {

        int[][] C = new int[a.length()+1][b.length()+1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    C[i+1][j+1] = C[i][j] + 1;
                } else {
                    C[i+1][j+1] = Math.max(C[i+1][j], C[i][j+1]);
                }
            }
        }

        return C[a.length()][b.length()];
        /*int[] lettersOne = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            lettersOne[s1.charAt(i) - 'A']++;
        }

        int[] lettersTwo = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            lettersTwo[s2.charAt(i) - 'A']++;
        }


        int childLength = 0;
        int counter = 0;
        while (counter < lettersOne.length) {

            int diff = lettersTwo[counter] - lettersOne[counter];

            if (diff == 0) childLength = childLength + lettersTwo[counter];
            if (diff > 0) childLength = childLength + lettersOne[counter];
            if (diff < 0) childLength = childLength + lettersTwo[counter];
            counter++;
        }
        return childLength;*/
    }
}
