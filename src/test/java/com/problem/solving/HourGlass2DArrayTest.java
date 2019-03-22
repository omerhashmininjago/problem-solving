package com.problem.solving;

import org.junit.Assert;
import org.junit.Test;

public class HourGlass2DArrayTest {

    HourGlass2DArray hourGlass2DArray = new HourGlass2DArray();

    @Test
    public void testHourglassSum() {

        int[][] arr = new int[6][6];

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[1][3] = 0;
        arr[1][4] = 0;
        arr[1][5] = 0;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 0;
        arr[2][4] = 0;
        arr[2][5] = 0;
        arr[3][0] = 0;
        arr[3][1] = 0;
        arr[3][2] = 2;
        arr[3][3] = 4;
        arr[3][4] = 4;
        arr[3][5] = 0;
        arr[4][0] = 0;
        arr[4][1] = 0;
        arr[4][2] = 0;
        arr[4][3] = 2;
        arr[4][4] = 0;
        arr[4][5] = 0;
        arr[5][0] = 0;
        arr[5][1] = 0;
        arr[5][2] = 1;
        arr[5][3] = 2;
        arr[5][4] = 4;
        arr[5][5] = 0;

        int expectedResult = 19;
        int actualResult = hourGlass2DArray.hourglassSum(arr);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testHourglassSumTwo() {

        int[][] arr = new int[6][6];

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[1][3] = 0;
        arr[1][4] = 0;
        arr[1][5] = 0;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 0;
        arr[2][4] = 0;
        arr[2][5] = 0;
        arr[3][0] = 0;
        arr[3][1] = 9;
        arr[3][2] = 2;
        arr[3][3] = -4;
        arr[3][4] = -4;
        arr[3][5] = 0;
        arr[4][0] = 0;
        arr[4][1] = 0;
        arr[4][2] = 0;
        arr[4][3] = -2;
        arr[4][4] = 0;
        arr[4][5] = 0;
        arr[5][0] = 0;
        arr[5][1] = 0;
        arr[5][2] = -1;
        arr[5][3] = -2;
        arr[5][4] = -4;
        arr[5][5] = 0;

        int expectedResult = 13;
        int actualResult = hourGlass2DArray.hourglassSum(arr);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
