package com.problem.solving;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RansomNotes {

    public String checkMagazine(String[] magazine, String[] note) {

        if (magazine.length < note.length) return "No";

        Map<String, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length - 1; i++) {
            if (magazineMap.containsKey(magazine[i])) {
                magazineMap.put(magazine[i], magazineMap.get(magazine[i]) + 1);
            } else magazineMap.put(magazine[i], 1);
        }
        for (int i = 0; i < note.length; i++) {

            if (magazineMap.containsKey(note[i])) {
                Integer count = magazineMap.get(note[i]) -1;
                if (count == 0) {
                    magazineMap.remove(note[i]);
                } else magazineMap.put(note[i], count - 1);
            }
             else return "No";
        }
        return "Yes";

        // below commented code was giving timeout
        /*List magazineList = Arrays.stream(magazine).collect(Collectors.toList());
        List noteList = Arrays.stream(note).collect(Collectors.toList());

        for(int i = 0; i< note.length; i++) {

            int magazineCount = Collections.frequency(magazineList, note[i]);
            int noteCount = Collections.frequency(noteList, note[i]);
            if (noteCount > magazineCount) {
                System.out.println("No"); return;
            }

        }*/
    }
}
