package com.problem.solving;

public class AlternatingCharacters {

    public int alternateCharacter(String ab) {

        char[] abChar = ab.toCharArray();
        int deletedCharacters = 0;
        int previousElement = 0;
        int currentElement = 1;

        while (true) {

            if (currentElement == abChar.length) {
                deletedCharacters = deletedCharacters + abChar.length - previousElement - 1;
                break;
            }
            if (abChar[currentElement] == abChar[previousElement]) {
                deletedCharacters++;
                previousElement = currentElement;
                currentElement++;
            } else {
                previousElement = currentElement;
                currentElement++;
            }

        }
        return deletedCharacters;
    }
}
