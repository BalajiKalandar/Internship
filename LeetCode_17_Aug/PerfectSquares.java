package com.java.flipDailyQuestion;

public class PerfectSquares {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1]; // dp[i] will store the least number of perfect square numbers that sum up to i

        for (int i = 1; i <= n; i++) {
            int minSquares = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minSquares = Math.min(minSquares, dp[i - j * j] + 1);
            }
            dp[i] = minSquares;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 24;
        System.out.println("Least number of perfect square numbers that sum to " + n + " is: " + numSquares(n));
    }
}

