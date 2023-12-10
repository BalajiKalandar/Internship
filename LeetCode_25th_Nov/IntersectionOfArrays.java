package com.java.timest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check for common elements between nums2 and set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert set to array
        int[] intersectionArray = new int[result.size()];
        int index = 0;
        for (int num : result) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    }

    public static void main(String[] args) {
        IntersectionOfArrays solution = new IntersectionOfArrays();

        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = solution.intersection(nums1, nums2);
        System.out.println("Example 1 Output: " + java.util.Arrays.toString(result1));

        // Example 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = solution.intersection(nums3, nums4);
        System.out.println("Example 2 Output: " + java.util.Arrays.toString(result2));
    }
}

