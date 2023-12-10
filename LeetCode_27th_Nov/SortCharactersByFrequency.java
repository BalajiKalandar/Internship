package com.java.timest;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        // Count the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Use a PriorityQueue (Min Heap) to sort characters by frequency
        PriorityQueue<Character> minHeap = new PriorityQueue<>((a, b) -> charFrequency.get(b) - charFrequency.get(a));
        minHeap.addAll(charFrequency.keySet());

        // Build the sorted string
        StringBuilder result = new StringBuilder();
        while (!minHeap.isEmpty()) {
            char currentChar = minHeap.poll();
            int frequency = charFrequency.get(currentChar);
            for (int i = 0; i < frequency; i++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequency solution = new SortCharactersByFrequency();

        // Example 1
        String s1 = "tree";
        System.out.println("Example 1 Output: " + solution.frequencySort(s1));

        // Example 2
        String s2 = "cccaaa";
        System.out.println("Example 2 Output: " + solution.frequencySort(s2));

        // Example 3
        String s3 = "Aabb";
        System.out.println("Example 3 Output: " + solution.frequencySort(s3));
    }
}

