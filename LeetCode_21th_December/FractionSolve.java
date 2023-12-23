package com.java.dec21;

import java.util.Scanner;

public class FractionSolve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = scanner.nextLine();
        String result = fractionAddition(expression);
        System.out.println("Output: " + result);
    }

    public static String fractionAddition(String expression) {
        String[] tokens = expression.split("(?=[-+])");

        int resultNum = 0;
        int resultDenom = 1;
        int sign = 1;

        for (String token : tokens) {
            if (token.contains("/")) {
                String[] parts = token.split("/");
                int numerator = Integer.parseInt(parts[0]);
                int denominator = Integer.parseInt(parts[1]);
                resultNum = resultNum + sign * numerator * resultDenom;
                resultDenom = resultDenom * denominator;
            } else {
                sign = token.equals("+") ? 1 : -1;
            }
        }

        // Simplify the result
        int gcd = gcd(Math.abs(resultNum), resultDenom);
        resultNum /= gcd;
        resultDenom /= gcd;

        // Format the result as a string
        if (resultDenom == 1) {
            return resultNum + "/1";
        } else {
            return resultNum + "/" + resultDenom;
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}

