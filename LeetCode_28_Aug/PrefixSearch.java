package com.java.s28thdsa;

public class PrefixSearch {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-indexed position
            }
        }
        
        return -1; // Return -1 if no matching word found
    }

    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int result = isPrefixOfWord(sentence, searchWord);
        System.out.println("Output: " + result); // Output: 4
    }
}

