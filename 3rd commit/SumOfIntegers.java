package com.exercise3.java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {
	public static void main(String[] args) {

		int n;
		int sum = 0;
		//user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integers: ");
		String str = scanner.nextLine();
		
        //in-built tokenizer class
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("All intergers: ");

		//logic to sum the numbers entered
		while (st.hasMoreTokens()) {

			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.print(n + " ");
			sum += n;
		}

		System.out.println();
		System.out.println("Sum of integers is: " + sum);

		//resourse closing
		scanner.close();
	}

}
