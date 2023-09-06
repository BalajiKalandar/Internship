package com.java.fifthSep23;

import java.util.Arrays;

public class MinimumOperationsToMakeAllOne {
    public static void main(String[] args) {
        int[] nums1 = {2, 6, 3, 4};
        System.out.println(minOperations(nums1)); // Output: 4

        int[] nums2 = {2, 10, 6, 14};
        System.out.println(minOperations(nums2)); // Output: -1
    }

    public static int minOperations(int[] nums) {
        int n = nums.length;
        int operations = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                continue;
            }

            int gcd = nums[i];
            for (int j = i + 1; j < n; j++) {
                gcd = gcd(gcd, nums[j]);
                if (gcd == 1) {
                    operations += (j - i);
                    break;
                }
            }

            if (gcd != 1) {
                return -1; // It's impossible to make all elements equal to 1
            }
        }

        return operations;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
