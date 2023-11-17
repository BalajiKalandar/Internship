package com.java.seventeenNov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatenatedSubstring {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        Map<String, Integer> wordFreqMap = new HashMap<>();
        for (String word : words) {
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLen; i++) {
            String subString = s.substring(i, i + totalLen);
            Map<String, Integer> tempMap = new HashMap<>();

            for (int j = 0; j < totalLen; j += wordLen) {
                String word = subString.substring(j, j + wordLen);
                tempMap.put(word, tempMap.getOrDefault(word, 0) + 1);
            }

            if (tempMap.equals(wordFreqMap)) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        System.out.println(findSubstring(s1, words1)); 

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        System.out.println(findSubstring(s2, words2)); 

        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"};
        System.out.println(findSubstring(s3, words3));
    }
}
