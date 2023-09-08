package com.java.flip08thSep;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        
        // Create a list of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Convert k to 0-based index
        k--;
        
        // Calculate factorials and select digits
        for (int i = 1; i <= n; i++) {
            int factorial = factorial(n - i);
            int index = k / factorial;
            System.out.println("value of index is "+index);
            result.append(numbers.get(index));
            
            numbers.remove(index);
            k %= factorial;
            
        }
        
        return result.toString();
    }
    
    private int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        PermutationSequence solution = new PermutationSequence();
        int n = 5;
        int k = 6;
        String permutation = solution.getPermutation(n, k);
        System.out.println("The " + k + "th permutation is: " + permutation);
    }
}
