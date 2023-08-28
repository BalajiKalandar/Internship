package com.java.s28thdsa;

import java.util.Arrays;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
    String word;

    TrieNode() {
        isEndOfWord = false;
        word = null;
    }
}

public class LongestWordInDictionary {
    TrieNode root;

    public String longestWord(String[] words) {
        root = new TrieNode();
        Arrays.sort(words); // Sort the words lexicographically
        String result = "";

        for (String word : words) {
            insertWord(word);
        }

        for (String word : words) {
            if (isBuildable(word)) {
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private void insertWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
        node.word = word;
    }

    private boolean isBuildable(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null || !node.children[index].isEndOfWord) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"w","wo","wor","worl","world"};
        LongestWordInDictionary solution = new LongestWordInDictionary();
        String longestWord = solution.longestWord(words);
        System.out.println("Longest word: " + longestWord); // Output: "world"
    }
}
