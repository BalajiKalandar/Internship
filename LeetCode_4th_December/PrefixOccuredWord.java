package com.java.timest;

public class PrefixOccuredWord {
	public static void main(String[] args) {
		String sentence = "I love to eat sum burger";
		String serach = "burg";
		int pref = findGivenPrefixWord(sentence, serach);
		System.out.println("prefix is " + pref);
	}

	public static int findGivenPrefixWord(String sen, String search) {
		String[] charArray = sen.split(" ");
		for (int i = 0; i < charArray.length; i++) {
			String temp = charArray[i];
			int minLength = Math.min(temp.length(), search.length());
			for (int j = 0; j < minLength; j++) {
				if (temp.charAt(j) != search.charAt(j)) {
					break;
				}
				if (j == minLength - 1) {
					return i + 1;
				}
			}

		}
		return -1;
	}

}
