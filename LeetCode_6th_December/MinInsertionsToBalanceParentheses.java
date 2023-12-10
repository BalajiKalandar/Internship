package com.java.timest;

public class MinInsertionsToBalanceParentheses {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))")); // Output: 1
        System.out.println(minInsertions("())"));    // Output: 0
        System.out.println(minInsertions("))())(")); // Output: 3
    }

    public static int minInsertions(String s) {
        int insertions = 0;
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance += 2; 
                if (balance % 2 != 0) {
                    insertions++;
                    balance--;
                }
            } else {
                balance--; 
                if (balance < 0) {
                
                    insertions++;
                    balance += 2; 
                }
            }
        }
        insertions += balance / 2;

        return insertions;
    }
}

