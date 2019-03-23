package com.problem.solving;

public class MinimumBribes {

    public String minimumBribes(int[] q) {


        int minimumBribes = 0;


        for (int y = 0; y < q.length; y++) {
            int bribesPerIndividual = 0;
            if (q[y] > q[y + 1]) {
                bribesPerIndividual = bribesPerIndividual + q[y] - q[y + 1];
            }
            if (bribesPerIndividual > 2) {
                return "Too Chaotic";
            }
            minimumBribes = minimumBribes + bribesPerIndividual;
        }

        return String.valueOf(minimumBribes);

    }
}
