package com.java.dec19Nov;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 19;
        System.out.println(isHappy(n1)); // Output: true

        int n2 = 2;
        System.out.println(isHappy(n2)); // Output: false
    }
}

