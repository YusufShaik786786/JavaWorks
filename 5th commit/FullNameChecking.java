package com.hello.world;

import java.util.Scanner;

public class FullNameChecking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter the first name::");
			String firstname = sc.nextLine();
			System.out.println("Enter the first name::");
			String lastname = sc.nextLine();

			if (firstname.isEmpty()&&lastname.isEmpty()) {
				throw new BlankNameException();
			} else {
				System.out.println("Your FUllNameis::"+firstname+" "+lastname);
			}
		}

		catch (BlankNameException bne) {
			System.out.println("Enter Your First Name And Last Name");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
