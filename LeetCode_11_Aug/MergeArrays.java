package com.java.flip11thAugust;

import java.util.*;

public class MergeArrays {
    public static int[][] merge(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> idToValue = new HashMap<>();

        // Merge values from nums1 into the map
        for (int[] entry : nums1) {
            idToValue.put(entry[0], idToValue.getOrDefault(entry[0], 0) + entry[1]);
        }

        // Merge values from nums2 into the map
        for (int[] entry : nums2) {
            idToValue.put(entry[0], idToValue.getOrDefault(entry[0], 0) + entry[1]);
        }

        // Convert the map entries to an array and sort by id
        int[][] result = new int[idToValue.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : idToValue.entrySet()) {
            result[index][0] = entry.getKey();
            result[index][1] = entry.getValue();
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{1, 5}, {2, 3}, {5, 7}};
        int[][] nums2 = {{2, 8}, {4, 6}, {5, 1}};

        int[][] result = merge(nums1, nums2);

        for (int[] entry : result) {
            System.out.println(Arrays.toString(entry));
        }
    }
}

