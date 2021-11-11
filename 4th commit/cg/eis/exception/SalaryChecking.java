package com.cg.eis.exception;

import java.util.Scanner;

public class SalaryChecking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter Your Salary::");
			int salary = sc.nextInt();

			if (salary < 3000) {
				throw new EmployeeException();
			} else {
				System.out.println("Welcome!...........");
			}
		} catch (EmployeeException empe) {
			System.out.println("Enter the Salary Above 3000!.........");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
