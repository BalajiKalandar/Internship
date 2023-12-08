package com.java.dec19Nov;

public class PowerOfThreeSum {

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkPowersOfThree(12));  // Output: true
        System.out.println(checkPowersOfThree(91));  // Output: true
        System.out.println(checkPowersOfThree(21));  // Output: false
    }

    public static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false; // If the remainder is 2, it's not possible to represent n.
            }
            n /= 3; // Divide n by 3 to check the next power of three.
        }
        return true; // If we reach here, n can be represented as the sum of distinct powers of three.
    }
}

