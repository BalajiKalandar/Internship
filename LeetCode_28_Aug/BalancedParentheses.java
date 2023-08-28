package com.java.s28thdsa;

public class BalancedParentheses {
    public static int minInsertions(String s) {
        int insertions = 0;
        int openCount = 0;  // Count of open parentheses that haven't been closed

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openCount++;
            } else {
                // If a closing parenthesis is encountered
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // If there's a consecutive closing parenthesis, move to the next character
                    i++;
                } else {
                    // If no consecutive closing parenthesis, insert one
                    insertions++;
                }

                if (openCount > 0) {
                    openCount--;  // Match the closing parenthesis with a previously unmatched open parenthesis
                } else {
                    insertions++;  // Need to insert an open parenthesis to match the current closing parenthesis
                }
            }
        }

        return insertions + (openCount * 2);  // For each unmatched open parenthesis, add two closing parentheses
    }

    public static void main(String[] args) {
        String s1 = "(()))";
        System.out.println("Output 1: " + minInsertions(s1));  // Output: 1

        String s2 = "())";
        System.out.println("Output 2: " + minInsertions(s2));  // Output: 0

        String s3 = "))())(";
        System.out.println("Output 3: " + minInsertions(s3));  // Output: 3
    }
}

