package com.java.timest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSum {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        // Populate the index map for list1
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }

        // Check common strings in list2 and update the result
        for (int j = 0; j < list2.length; j++) {
            if (indexMap.containsKey(list2[j])) {
                int indexSum = j + indexMap.get(list2[j]);
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(list2[j]);
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        MinimumIndexSum solution = new MinimumIndexSum();

        // Example 1
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result1 = solution.findRestaurant(list1, list2);
        System.out.println("Example 1 Output: " + java.util.Arrays.toString(result1));

        // Example 2
        String[] list3 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list4 = {"KFC", "Shogun", "Burger King"};
        String[] result2 = solution.findRestaurant(list3, list4);
        System.out.println("Example 2 Output: " + java.util.Arrays.toString(result2));

        // Example 3
        String[] list5 = {"happy", "sad", "good"};
        String[] list6 = {"sad", "happy", "good"};
        String[] result3 = solution.findRestaurant(list5, list6);
        System.out.println("Example 3 Output: " + java.util.Arrays.toString(result3));
    }
}

