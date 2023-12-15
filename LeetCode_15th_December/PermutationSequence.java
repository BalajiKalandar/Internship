package com.java.dec15;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        factorial[0] = 1;

        // Populate the factorial array
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
            numbers.add(i);
        }

        // Adjust k to be 0-based
        k--;

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            result.append(numbers.get(index));
            numbers.remove(index);
            k -= index * factorial[n - i];
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(getPermutation(3, 3));  // Output: "213"
        System.out.println(getPermutation(4, 9));  // Output: "2314"
        System.out.println(getPermutation(3, 1));  // Output: "123"
    }
}

