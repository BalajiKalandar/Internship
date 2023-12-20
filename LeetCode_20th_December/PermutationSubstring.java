package com.java.dec20;

import java.util.Arrays;

public class PermutationSubstring {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Initialize the count arrays for s1 and the initial window in s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Check if the initial window is a permutation of s1
        if (Arrays.equals(s1Count, windowCount)) {
            return true;
        }

        // Move the window through the rest of s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // Update the window count for the new character entering the window
            windowCount[s2.charAt(i) - 'a']++;

            // Update the window count for the character leaving the window
            windowCount[s2.charAt(i - s1.length()) - 'a']--;

            // Check if the current window is a permutation of s1
            if (Arrays.equals(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Example 1
        String s1_1 = "ab";
        String s2_1 = "eidbaooo";
        System.out.println("Example 1: " + checkInclusion(s1_1, s2_1)); // Output: true

        // Example 2
        String s1_2 = "ab";
        String s2_2 = "eidboaoo";
        System.out.println("Example 2: " + checkInclusion(s1_2, s2_2)); // Output: false
    }
}
