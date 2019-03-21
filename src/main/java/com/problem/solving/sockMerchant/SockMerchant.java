package com.problem.solving.sockMerchant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {

    public int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> sockPairing = new HashMap<>();
        List pairCounts = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            Integer count = sockPairing.get(ar[i]);
            count = count == null ? 1 : count +1;
            sockPairing.put(ar[i], count);

                if (count % 2 == 0) {
                    pairCounts.add(ar[i]);
                }
        }

        return pairCounts.size();
    }

}
