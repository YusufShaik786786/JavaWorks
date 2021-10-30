package com.bankinheritance.java;

public class Bank {

	public static void main(String[] args) {
		Person p1 = new Person("Smith", 25, 2000);
		p1.deposit(2000);
		Person p2 = new Person("Kathy", 30, 3000);
		p2.withdraw(2000);

		System.out.println("Updated Balance in" + " " + p1.getName() + " " + "is=" + p1.getpBalance());
		System.out.println("Updated Balance in" + " " + p2.getName() + " " + "is=" + p2.getpBalance());

		/*
		 * SavingAccount sa1 = new SavingAccount(p1); sa1.setAccNum((long)
		 * Math.random()); sa1.setBalance(p1.getpBalance());
		 * 
		 * CurrentAccount ca1 = new CurrentAccount(p1); ca1.setAccNum((long)
		 * Math.random()); ca1.setBalance(p1.getpBalance());
		 * 
		 * SavingAccount sa2 = new SavingAccount(p2); sa2.setAccNum((long)
		 * Math.random()); sa2.setBalance(p1.getpBalance());
		 * 
		 * CurrentAccount ca2 = new CurrentAccount(p2); ca2.setAccNum((long)
		 * Math.random()); ca2.setBalance(p1.getpBalance());
		 */
		
		
		Account a=new Account(p1);
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
