package com.java.timest;

public class PerfectSquares {

    public int numSquares(int n) {
        if (n <= 0) {
            return 0;
        }

        // dp[i] represents the least number of perfect square numbers that sum to i
        int[] dp = new int[n + 1];

        // Initialize dp array with maximum possible values
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        PerfectSquares solution = new PerfectSquares();

        // Example 1
        int n1 = 12;
        System.out.println("Example 1 Output: " + solution.numSquares(n1));

        // Example 2
        int n2 = 13;
        System.out.println("Example 2 Output: " + solution.numSquares(n2));
    }
}

