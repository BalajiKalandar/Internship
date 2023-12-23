package com.java.dec21;
import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 2, 5, 2, 3, 7};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 1};

        System.out.println(findLHS(nums1)); // Output: 5
        System.out.println(findLHS(nums2)); // Output: 2
        System.out.println(findLHS(nums3)); // Output: 0
    }

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        // Iterate through the keys of the map
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(key + 1)) {
                int currentLen = frequencyMap.get(key) + frequencyMap.get(key + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
}

