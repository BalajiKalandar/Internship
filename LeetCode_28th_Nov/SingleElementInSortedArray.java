package com.java.timest;

public class SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is even or odd
            if (mid % 2 == 1) {
                mid--; // Adjust mid to be even
            }

            // Compare elements on the right side of mid
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        SingleElementInSortedArray solution = new SingleElementInSortedArray();

        // Example 1
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("Example 1 Output: " + solution.singleNonDuplicate(nums1));

        // Example 2
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        System.out.println("Example 2 Output: " + solution.singleNonDuplicate(nums2));
    }
}
