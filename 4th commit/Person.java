package com.bankinheritance.java;

public class Person {
	private String name;
	private int age;
	private double pBalance;

	public Person(String name, int age, double pBalance) {
		this.name = name;
		this.age = age;
		this.pBalance = pBalance;
	}

	public void deposit(double pBalance) {
		this.pBalance = pBalance + pBalance;

	}

	public void withdraw(double amount) {
		this.pBalance = pBalance - amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getpBalance() {
		return pBalance;
	}

	public void setpBalance(double pBalance) {
		this.pBalance = pBalance;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pBalance=" + pBalance + "]";
	}
	
	

}
