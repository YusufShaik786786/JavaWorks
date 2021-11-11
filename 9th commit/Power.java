package com.steams.java;

@FunctionalInterface
interface PowerOfY {
	
	//method to do power
	public double power(int a, int b);
}

public class Power {
	public static void main(String[] args) {
		
        //lambda expression to compute x pow of y
		PowerOfY val = (a, b) -> Math.pow(a, b);
		int result = (int) val.power(2, 3);
		
		System.out.println(result);

	}
}
