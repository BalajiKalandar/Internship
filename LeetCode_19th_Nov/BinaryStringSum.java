package com.java.dec19Nov;

public class BinaryStringSum {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Start from the rightmost bit and move towards the left
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            // Get the current bits from the strings or assume 0 if the string is exhausted
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;

            // Calculate the sum and carry
            int sum = bitA + bitB + carry;
            result.insert(0, sum % 2); // Insert the current bit at the beginning
            carry = sum / 2; // Update the carry
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1)); // Output: "100"

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2)); // Output: "10101"
    }
}
