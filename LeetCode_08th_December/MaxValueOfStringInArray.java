package com.java.timest;

import java.util.Arrays;
import java.util.Comparator;

public class MaxValueOfStringInArray {

    public int maxValue(String[] strs) {
        int maxValue = 0;

        for (String str : strs) {
            int currentVal = getValue(str);
            maxValue = Math.max(maxValue, currentVal);
        }

        return maxValue;
    }

    private int getValue(String str) {
        // Check if the string consists only of digits
        if (str.matches("\\d+")) {
            return Integer.parseInt(str);
        } else {
            return str.length();
        }
    }

    public static void main(String[] args) {
        MaxValueOfStringInArray solution = new MaxValueOfStringInArray();

        // Example 1
        String[] strs1 = {"alic3", "bob", "3", "4", "00000"};
        System.out.println("Example 1 Output: " + solution.maxValue(strs1));

        // Example 2
        String[] strs2 = {"1", "01", "001", "0001"};
        System.out.println("Example 2 Output: " + solution.maxValue(strs2));
    }
}


    