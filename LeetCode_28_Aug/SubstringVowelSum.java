package com.java.s28thdsa;
// not completed
public class SubstringVowelSum {
    public static long countVowelSubstrings(String word) {
        int n = word.length();
        return countVowelSubstringsRecursive(word, 0, n - 1);
    }

    private static long countVowelSubstringsRecursive(String word, int start, int end) {
        if (start > end) {
            return 0;
        }

        long vowelsInSubstring = countVowels(word.substring(start, end + 1));
        return vowelsInSubstring + countVowelSubstringsRecursive(word, start + 1, end)
                                 + countVowelSubstringsRecursive(word, start, end - 1)
                                 - countVowelSubstringsRecursive(word, start + 1, end - 1);
    }

    private static int countVowels(String substring) {
        int count = 0;
        for (char c : substring.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "aba";
        long result = countVowelSubstrings(word);
        System.out.println("Output: " + result);
    }
}
