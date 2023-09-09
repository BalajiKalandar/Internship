package com.java.flip09thSep;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        generateCombinations(result, currentCombination, 1, n, k);
        return result;
    }

    private void generateCombinations(List<List<Integer>> result, List<Integer> currentCombination, int start, int n, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i <= n; i++) {
            currentCombination.add(i);
            generateCombinations(result, currentCombination, i + 1, n, k - 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        int n1 = 4, k1 = 2;
        System.out.println(combinations.combine(n1, k1));

        int n2 = 1, k2 = 1;
        System.out.println(combinations.combine(n2, k2));
    }
}

