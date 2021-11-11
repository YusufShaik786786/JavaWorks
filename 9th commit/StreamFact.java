package com.steams.java;

import java.util.Scanner;

@FunctionalInterface
interface FactOf {
	int getFact(int num);
}

public class StreamFact {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		FactOf fact = (num) -> {
			int output = 1;
			for (int i = 0; i <= num; i++) {
				if (i == 0)
					output = 1;
				else {
					output *= i;
				}
			}
			return output;
		};

		System.out.println("Enter number: ");
		int num = scn.nextInt();
		System.out.println("Factorial of a number " + num + " is: " + fact.getFact(num));

		scn.close();
	}
}
