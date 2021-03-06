package com.exercise1.java;

import java.util.Scanner;

public class SumOfCubesOfDigits {

	public static void main(String[] args) {

		//user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to sum of cubes: ");
		int num = scanner.nextInt();
		System.out.println("Sum of the cubes of the digits of the number " + num + " is: " + displaySum(num));

	}

	public static int displaySum(int num) {

		int sum = 0;

		while (num != 0) {

			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, 3);
			num /= 10;
		}
		return sum;
	}

}
