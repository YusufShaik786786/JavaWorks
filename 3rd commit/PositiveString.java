package com.exercise3.java;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveString {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// user input
		System.out.println("Enter a string to check it is positive string or not: ");
		String str = scanner.nextLine();

		// checking whether the string is a positive string
		if (isAlphabaticOrder(str)) {
			System.out.println(str + " is a positive string");
		} else {
			System.out.println(str + " is not a positive string");
		}

	}

	//checks whether the string is in alphabetical order or not
	public static boolean isAlphabaticOrder(String str) {

		// length of the string
		int length = str.length();

		char chars[] = new char[length];

		//string to char array assigning
		for (int i = 0; i < length; i++) {
			chars[i] = str.charAt(i);
		}

		Arrays.sort(chars);

		// checking whether the char array is equal to string or not
		for (int i = 0; i < length; i++) {
			if (chars[i] != str.charAt(i))
				return false;
		}
		return true;
	}

}
