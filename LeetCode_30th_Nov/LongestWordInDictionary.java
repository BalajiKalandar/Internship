package com.java.timest;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWordInDictionary {
    public static void main(String[] args) {
        String[] words1 = {"w", "wo", "wor", "worl", "world"};
        System.out.println(longestWord(words1)); // Output: "world"

        String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(longestWord(words2)); // Output: "apple"
    }

    public static String longestWord(String[] words) {
        Arrays.sort(words); // Sort the words lexicographically

        HashSet<String> set = new HashSet<>();
        String result = "";

        for (String word : words) {
            // Check if all prefixes of the word are present in the set
            boolean isValid = true;
            for (int i = 1; i < word.length(); i++) {
                if (!set.contains(word.substring(0, i))) {
                    isValid = false;
                    break;
                }
            }

            // If all prefixes are valid, update the result if the word is longer
            if (isValid) {
                set.add(word);
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}

