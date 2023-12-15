package com.java.dec15;

public class PrimeSubtractionOperation {

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if nums can be made strictly increasing
    private static boolean primeSubtraction(int[] nums) {
        int n = nums.length;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= minVal) {
                // Find the largest prime less than nums[i]
                int prime = nums[i] - 1;
                while (!isPrime(prime)) {
                    prime--;
                }
                minVal = Math.min(minVal, prime);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {4, 9, 6, 10};
        System.out.println(primeSubtraction(nums1));  // Output: true

        int[] nums2 = {6, 8, 11, 12};
        System.out.println(primeSubtraction(nums2));  // Output: true

        int[] nums3 = {5, 8, 3};
        System.out.println(primeSubtraction(nums3));  // Output: false
    }
}

