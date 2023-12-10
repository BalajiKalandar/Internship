package com.java.timest;

public class MinOperationsToMakeAllEqualToOne {

    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        // Check if any number in the array is greater than 1
        for (int num : nums) {
            if (num > 1) {
                operations++;
                break;
            }
        }

        // If there is no number greater than 1, it is impossible
        if (operations == 0) {
            return 0;
        }

        // If there is at least one number greater than 1, return -1
        // as it is impossible to make all elements equal to 1
        if (operations > 0) {
            return -1;
        }

        return operations;
    }

    public static void main(String[] args) {
        MinOperationsToMakeAllEqualToOne solution = new MinOperationsToMakeAllEqualToOne();

        // Example 1
        int[] nums1 = {2, 6, 3, 4};
        System.out.println("Example 1 Output: " + solution.minOperations(nums1));

        // Example 2
        int[] nums2 = {2, 10, 6, 14};
        System.out.println("Example 2 Output: " + solution.minOperations(nums2));
    }
}
