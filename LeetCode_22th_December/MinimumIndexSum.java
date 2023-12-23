package com.java.dec22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSum {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        String[] result = findRestaurant(list1, list2);
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();

        // Populate the index map with indices of strings in list1
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }

        int minIndexSum = Integer.MAX_VALUE;
        List<String> commonStrings = new ArrayList<>();

        // Iterate through list2
        for (int j = 0; j < list2.length; j++) {
            String currentString = list2[j];
            if (indexMap.containsKey(currentString)) {
                int currentIndexSum = j + indexMap.get(currentString);

                // Update minimum index sum and common strings
                if (currentIndexSum < minIndexSum) {
                    minIndexSum = currentIndexSum;
                    commonStrings.clear();
                    commonStrings.add(currentString);
                } else if (currentIndexSum == minIndexSum) {
                    commonStrings.add(currentString);
                }
            }
        }

        // Convert List to array for the result
        return commonStrings.toArray(new String[0]);
    }
}
