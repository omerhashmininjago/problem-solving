package com.problem.solving;

public class CountingValleys {

    public int countingValleys(int n, String s) {

        int trackingDownhillSteps = 0;
        int totalValleysCrossed = 0;
        boolean atSeaLevel = true;

        for (int i = 0; i < n; i++) {
            trackingDownhillSteps = s.charAt(i) == 'D' || s.charAt(i) == 'd' ? trackingDownhillSteps + 1 : trackingDownhillSteps - 1;
            totalValleysCrossed = atSeaLevel && trackingDownhillSteps == 1 ? totalValleysCrossed + 1 : totalValleysCrossed;
            atSeaLevel = trackingDownhillSteps == 0 ? true : false;
        }
        return totalValleysCrossed;
    }

}
