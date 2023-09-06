package com.java.fifthSep23;

import java.util.Arrays;

public class PrimeSubtractionOperation {

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static boolean canMakeIncreasing(int[] nums) {
        int n = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);

        for (int i = 0; i < n; i++) {
            if (nums[i] != sortedNums[i]) {
                boolean found = false;
                for (int j = 2; j < nums[i]; j++) {
                    if (isPrime(j) && nums[i] - j >= sortedNums[i]) {
                        nums[i] -= j;
                        found = true;
                        break;
                    }
                }
                if (!found) return false;
                i--; // Re-check the current element after the subtraction
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 6, 10};
        int[] nums2 = {6, 8, 11, 12};
        int[] nums3 = {5, 8, 3};

        System.out.println(canMakeIncreasing(nums1)); // Output: true
        System.out.println(canMakeIncreasing(nums2)); // Output: true
        System.out.println(canMakeIncreasing(nums3)); // Output: false
    }
}
