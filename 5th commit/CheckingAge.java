package com.hello.world;

import java.util.Scanner;

public class CheckingAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter the Age");
			int age = sc.nextInt();

			if (age <= 15) {
				// throw new InvalidAgeException();

				throw new InvalidAgeException("Age Of a Person Should be Above 15");
			} else {
				System.out.println("Your Welcome!......");
			}
		}

		/*
		 * catch (InvalidAgeException iae) {
		 * System.out.println("Age Of a Person Should be Above 15"); }
		 */

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
