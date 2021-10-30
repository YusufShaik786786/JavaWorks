package com.exercise3.java;

import java.util.Scanner;

public class StringImage {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String that you want to mirror: ");
		//taking user input
		String str = scn.nextLine();
		System.out.println("Mirror String is: " + getImage(str));
		scn.close();
	}

	// method that reverse the string
	public static String getImage(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}

		// mirror string
		str = str + "|" + revStr;
		return str;
	}
}
