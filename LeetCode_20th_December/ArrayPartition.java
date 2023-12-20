package com.java.dec20;

import java.util.Arrays;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int sum = 0;

        // Pair adjacent elements and sum the minimum of each pair
        for (int i = 0; i < nums.length; i += 2) {
            // Add the smaller of the two elements in each pair
            sum += Math.min(nums[i], nums[i + 1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 4, 3, 2};
        System.out.println("Example 1: " + arrayPairSum(nums1)); // Output: 4

        // Example 2
        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println("Example 2: " + arrayPairSum(nums2)); // Output: 9
    }
}

