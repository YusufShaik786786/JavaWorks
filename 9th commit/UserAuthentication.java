package com.steams.java;

import java.util.Scanner;

interface NameAndPassword {
	boolean validate(String name, String password);
}

public class UserAuthentication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		NameAndPassword up = (username, password) -> username.equals("Yusuf998") && password.equals("Yusuf@1998");

		System.out.println("Enter Name; ");
		String username = scn.next();

		System.out.println();
		System.out.println("Enter Password: ");
		String password = scn.next();

		System.out.println();
		System.out.println("Result: " + up.validate(username, password));

		scn.close();
	}
}
