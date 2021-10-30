package com.bankinheritance.java;

import java.util.Random;

public class Account {

	private long accNum;
	private double balance;
	public Person accHolder;
	public Account() {
		System.out.println("The Account person Details are::");
	}
	
	public Account(Person accHolder) {
		this.accHolder=accHolder;
		this.balance=accHolder.getpBalance();
		Random r=new Random();
		this.accNum=Math.abs(r.nextLong());
	}
	
	void deposit(double amount) {
		this.balance=balance+amount;
	}

	Boolean withdraw(double amount) {
		balance = balance - amount;
		return true;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getPerson() {
		return accHolder;
	}

	public void setPerson(Person person) {
		this.accHolder = person;
	}

	@Override
	public String toString() {
		return "Account [accNum="+" "+"Of"+" "+accHolder.getName()+" "+"Is="+" "+ accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	

}
