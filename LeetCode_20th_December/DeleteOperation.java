package com.java.dec20;

public class DeleteOperation {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // dp[i][j] represents the length of LCS of word1[0...i-1] and word2[0...j-1]
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array using bottom-up dynamic programming
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The minimum number of steps is the sum of the lengths of both strings minus twice the length of the LCS
        return m + n - 2 * dp[m][n];
    }

    public static void main(String[] args) {
        // Example 1
        String word1_1 = "sea";
        String word2_1 = "eat";
        DeleteOperation solution1 = new DeleteOperation();
        System.out.println("Example 1: " + solution1.minDistance(word1_1, word2_1)); // Output: 2

        // Example 2
        String word1_2 = "leetcode";
        String word2_2 = "etco";
        DeleteOperation solution2 = new DeleteOperation();
        System.out.println("Example 2: " + solution2.minDistance(word1_2, word2_2)); // Output: 4
    }
}
