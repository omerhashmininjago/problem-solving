package com.problem.solving;

public class LeftRotation {

    public int[] rotateLeft(int[] a, int d) {

        int remainder = d % a.length;
        int[] rotatedArray = new int[a.length];

        for (int i = 0; i < a.length - remainder; i++) {
            rotatedArray[i] = a[i + remainder];
        }

        for (int i = 0; i < remainder; i++) {
            rotatedArray[a.length - remainder + i] = a[i];
        }
        return rotatedArray;
    }

}
