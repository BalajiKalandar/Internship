package com.java.dec19Nov;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        System.out.println(trailingZeroes(3));  // Output: 0
        System.out.println(trailingZeroes(5));  // Output: 1
        System.out.println(trailingZeroes(0));  // Output: 0
    }

    public static int trailingZeroes(int n) {
        int count = 0;

        // Count the number of factors of 5 in the prime factorization of n!
        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}

