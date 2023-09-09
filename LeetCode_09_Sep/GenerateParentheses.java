package com.java.flip09thSep;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesesRecursive(result, "", 0, 0, n);
        return result;
    }

    private void generateParenthesesRecursive(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesesRecursive(result, current + "(", open + 1, close, n);
        }
        if (close < open) {
            generateParenthesesRecursive(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generator = new GenerateParentheses();
        int n1 = 3;
        System.out.println(generator.generateParenthesis(n1));

        int n2 = 1;
        System.out.println(generator.generateParenthesis(n2));
    }
}

