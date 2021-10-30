package com.exercise3.java;

import java.util.Scanner;

public class ReplaceConsonants {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// user input
		System.out.println("Enter a any word: ");
		String str = scanner.nextLine();
		System.out.println("Given string is: " + str);

		System.out.println("After removing consonants: " + alterString(str));

		// closing resourse
		scanner.close();

	}

	private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";

	// method to replace consonants with immediate consonants
	public static String alterString(String str) {

		char[] characters = str.toLowerCase().toCharArray();
		for (int i = 0; i < characters.length; i++) {
			int index = CONSONANTS.indexOf(characters[i]);
			if (index != -1) {
				characters[i] = CONSONANTS.charAt((index + 1) % CONSONANTS.length());
			}
		}
		return new String(characters);
	}
}
