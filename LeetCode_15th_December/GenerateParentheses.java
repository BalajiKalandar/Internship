package com.java.dec15;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, n, "", result);
        return result;
    }

    private static void generateParenthesisHelper(int left, int right, String current, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        if (left > 0) {
            generateParenthesisHelper(left - 1, right, current + "(", result);
        }

        if (right > left) {
            generateParenthesisHelper(left, right - 1, current + ")", result);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 3;
        List<String> result1 = generateParenthesis(n1);
        System.out.println(result1);  // Output: ["((()))","(()())","(())()","()(())","()()()"]

        int n2 = 1;
        List<String> result2 = generateParenthesis(n2);
        System.out.println(result2);  // Output: ["()"]
    }
}

