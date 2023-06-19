package com.java.fliprobo1;

import java.util.Scanner;

// Write a java program to check whether character is vowel or consonant
public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		char ch = sc.next().charAt(0);
		if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch == 'e')
				|| (ch == 'i') || (ch == 'o') || (ch == 'u')) {
			System.out.println(ch + " is a vowel");

		} else if ((ch == 'B') || (ch == 'C') || (ch == 'D') || (ch == 'F') || (ch == 'G') || (ch == 'H') || (ch == 'J')
				|| (ch == 'K') || (ch == 'L') || (ch == 'M') || (ch == 'N') || (ch == 'P') || (ch == 'Q') || (ch == 'R')
				|| (ch == 'S') || (ch == 'T') || (ch == 'V') || (ch == 'W') || (ch == 'X') || (ch == 'Y') || (ch == 'Z')
				|| (ch == 'b') || (ch == 'c') || (ch == 'd') || (ch == 'f') || (ch == 'g') || (ch == 'h') || (ch == 'j')
				|| (ch == 'k') || (ch == 'l') || (ch == 'm') || (ch == 'n') || (ch == 'p') || (ch == 'q') || (ch == 'r')
				|| (ch == 's') || (ch == 't') || (ch == 'v') || (ch == 'w') || (ch == 'x') || (ch == 'y') || (ch == 'z')

		) {
			System.out.println(ch + " is a Consonant");
		} else
			System.out.println("Invalid Letter (neither vowel nor Consonants)");

	}

}
