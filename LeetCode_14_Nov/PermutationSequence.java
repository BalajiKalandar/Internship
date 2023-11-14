package com.java.flipDailyQuestion;
import java.util.ArrayList;
        import java.util.List;

public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder result = new StringBuilder();

        // Create a list of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Calculate factorials
        calculateFactorials(factorial);

        // Adjust k to be 0-based
        k--;

        // Generate the kth permutation
        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial[n - i];
        }

        return result.toString();
    }

    private static void calculateFactorials(int[] factorial) {
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = i * factorial[i - 1];
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 3, k1 = 3;
        System.out.println(getPermutation(n1, k1));  // Output: "213"

        int n2 = 4, k2 = 9;
        System.out.println(getPermutation(n2, k2));  // Output: "2314"

        int n3 = 3, k3 = 1;
        System.out.println(getPermutation(n3, k3));  // Output: "123"
    }
}
