package com.problem.solving;

public class HourGlass2DArray {

    public int hourglassSum(int[][] arr) {

        int maxValue = Integer.MIN_VALUE;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {

                // The below two loops are actually working on the 3X3 matrix to determine the hour glass sum
                int sum = 0;
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if ((i == (x + 1)) && ((i-x) == (y-j+ 1) || ((j-y) == (i-x + 1)))) {
                            sum = sum;
                        } else {
                            sum = sum + arr[i][j];
                        }
                    }
                }
                System.out.println(sum);
                maxValue = maxValue > sum ? maxValue : sum;
            }
        }
        return maxValue;
    }
}
