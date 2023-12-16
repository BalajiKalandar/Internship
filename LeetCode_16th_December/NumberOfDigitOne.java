package com.java.dec16;

public class NumberOfDigitOne {
    public static void main(String[] args) {
        // Test cases
        System.out.println(countDigitOne(13));   // Output: 6
        System.out.println(countDigitOne(0));    // Output: 0
    }

    public static int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }

        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }

        return count;
    }
}
