package com.java.timest;

import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactors {

    public int countDistinctPrimeFactors(int[] nums) {
        Set<Integer> distinctPrimeFactors = new HashSet<>();

        for (int num : nums) {
            distinctPrimeFactors.addAll(primeFactors(num));
        }

        return distinctPrimeFactors.size();
    }

    private Set<Integer> primeFactors(int num) {
        Set<Integer> factors = new HashSet<>();

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }

        if (num > 1) {
            factors.add(num);
        }

        return factors;
    }

    public static void main(String[] args) {
        DistinctPrimeFactors solution = new DistinctPrimeFactors();

        // Example 1
        int[] nums1 = {2, 4, 3, 7, 10, 6};
        System.out.println("Example 1 Output: " + solution.countDistinctPrimeFactors(nums1));

        // Example 2
        int[] nums2 = {2, 4, 8, 16};
        System.out.println("Example 2 Output: " + solution.countDistinctPrimeFactors(nums2));
    }
}

