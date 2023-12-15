package com.java.dec15;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end; start++) {
                if (dp[start] && wordSet.contains(s.substring(start, end))) {
                    dp[end] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "leetcode";
        List<String> wordDict1 = List.of("leet", "code");
        System.out.println(wordBreak(s1, wordDict1));  // Output: true

        String s2 = "applepenapple";
        List<String> wordDict2 = List.of("apple", "pen");
        System.out.println(wordBreak(s2, wordDict2));  // Output: true

        String s3 = "catsandog";
        List<String> wordDict3 = List.of("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak(s3, wordDict3));  // Output: false
    }
}
