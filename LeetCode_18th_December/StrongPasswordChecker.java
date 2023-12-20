package com.java.dec18;

public class StrongPasswordChecker {
    public static void main(String[] args) {
        System.out.println(minimumStepsToStrongPassword("a"));        // Output: 5
        System.out.println(minimumStepsToStrongPassword("aA1"));       // Output: 3
        System.out.println(minimumStepsToStrongPassword("1337C0d3"));  // Output: 0
    }

    public static int minimumStepsToStrongPassword(String password) {
        int steps = 0;
        int missingTypes = 3;

        if (password.length() < 6) {
            steps += Math.max(0, 6 - password.length());
        } else if (password.length() > 20) {
            steps += Math.max(0, password.length() - 20);
        }

        // Check for missing character types
        boolean hasLower = false, hasUpper = false, hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (hasLower) {
            missingTypes--;
        }
        if (hasUpper) {
            missingTypes--;
        }
        if (hasDigit) {
            missingTypes--;

        }

        // Handle repeating characters
        for (int i = 0; i < password.length() - 2; i++) {
            if (password.charAt(i) == password.charAt(i + 1) && password.charAt(i) == password.charAt(i + 2)) {
                steps++;
            }
        }

        if (password.length() <= 20) {
            return Math.max(steps, missingTypes);
        } else {
            int deleteCount = password.length() - 20;
            steps += deleteCount;

            int replaceCount = 0;
            int repeatsToRemove = Math.min(deleteCount, steps);
            steps -= repeatsToRemove;
            replaceCount += (repeatsToRemove / 3) * 2;

            return steps + Math.max(missingTypes, replaceCount);
        }
    }
}

