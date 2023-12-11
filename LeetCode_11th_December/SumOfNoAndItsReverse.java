package com.java.d11dec;

public class SumOfNoAndItsReverse {
    public static void main(String[] args) {
        int num = 63;
        System.out.println(canBeExpressedAsSum(num));
    }

    public static boolean canBeExpressedAsSum(int inputNum) {
        String original = Integer.toString(inputNum);
        String reverse = reverseNumber(inputNum);

        for (int i = 0; i <= inputNum / 2; i++) {
            if (!reverseNumber(i).isEmpty() && Integer.parseInt(reverseNumber(i)) + Integer.parseInt(reverse) == inputNum) {
                return true;
            }
        }
        return false;
    }

    public static String reverseNumber(int n) {
        StringBuilder reversed = new StringBuilder();
        while (n > 0) {
            int rem = n % 10;
            reversed.insert(0, rem);
            n /= 10;
        }
        return reversed.toString();
    }
}
