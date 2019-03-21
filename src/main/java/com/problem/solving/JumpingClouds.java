package com.problem.solving;

public class JumpingClouds {

    public int jumpingOnClouds(int[] c) {

        int cloudPosition = 0;
        int cloudsJumped = 0;
        while (c.length - cloudPosition > 1) {

            if (c.length - cloudPosition == 2) {
                cloudsJumped++;
                break;
            }
            cloudPosition = c[cloudPosition + 2] == 0 ? cloudPosition + 2 : cloudPosition + 1;
            cloudsJumped++;
        }

        return cloudsJumped;
    }
}
