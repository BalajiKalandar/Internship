package com.java.dec15;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combineHelper(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private static void combineHelper(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            combineHelper(n, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 4, k1 = 2;
        List<List<Integer>> result1 = combine(n1, k1);
        System.out.println(result1);  
        // Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]

        int n2 = 1, k2 = 1;
        List<List<Integer>> result2 = combine(n2, k2);
        System.out.println(result2);  
        // Output: [[1]]
    }
}
