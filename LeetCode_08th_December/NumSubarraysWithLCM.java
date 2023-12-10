package com.java.timest;

import java.util.HashMap;
import java.util.Map;

public class NumSubarraysWithLCM {

    public int numSubarraysWithLCM(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        int left1 = 0, left2 = 0, product1 = 1, product2 = 1;

        for (int right = 0; right < n; right++) {
            // Calculate the LCM for the first window
            product1 *= nums[right];

            // Calculate the LCM for the second window
            product2 *= nums[right];

            // Adjust the window for the first product until it is less than or equal to k
            while (product1 > k && left1 <= right) {
                product1 /= nums[left1++];
            }

            // Adjust the window for the second product until it is less than k
            while (product2 >= k && left2 <= right) {
                product2 /= nums[left2++];
            }

            // If the LCM is equal to k, update the result
            if (product1 == k) {
                result += right - left1 + 1;
            }

            // If the LCM is equal to k/2, update the result
            if (product2 == k / 2) {
                result += right - left2 + 1;
            }

            // Update the count map for the first product
            countMap.put(product1, countMap.getOrDefault(product1, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        NumSubarraysWithLCM solution = new NumSubarraysWithLCM();

        // Example 1
        int[] nums1 = {3, 6, 2, 7, 1};
        int k1 = 6;
        System.out.println("Example 1 Output: " + solution.numSubarraysWithLCM(nums1, k1));

        // Example 2
        int[] nums2 = {3};
        int k2 = 2;
        System.out.println("Example 2 Output: " + solution.numSubarraysWithLCM(nums2, k2));
    }
}

