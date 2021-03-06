package com.exercise1.java;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check for power of two: ");
		int n = scanner.nextInt();
		if (checkNumber(n))
			System.out.println(n + " is a power of 2");
		else {
			System.out.println(n + " is not a power of 2.");
		}

	}

	// checking power of 2 or not

	static boolean checkNumber(int n) {

		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
}
