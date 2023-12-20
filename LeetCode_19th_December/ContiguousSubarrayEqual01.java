package com.java.dec19;

import java.util.HashMap;

public class ContiguousSubarrayEqual01 {
    public static void main(String[] args) {
        int[] nums1 = {0, 1};
        System.out.println(findMaxLength(nums1));  // Output: 2

        int[] nums2 = {0, 1, 0};
        System.out.println(findMaxLength(nums2));  // Output: 2
    }

    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1); // Initialize with a sum of 0 at index -1

        for (int i = 0; i < nums.length; i++) {
            // Increment the sum for 1, and decrement for 0
            sum += (nums[i] == 1) ? 1 : -1;

            if (sumIndexMap.containsKey(sum)) {
                // If the sum is encountered again, calculate the length of the subarray
                maxLength = Math.max(maxLength, i - sumIndexMap.get(sum));
            } else {
                // Store the current sum and its index if it's not encountered before
                sumIndexMap.put(sum, i);
            }
        }

        return maxLength;
    }
}
