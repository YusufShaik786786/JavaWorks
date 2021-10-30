package com.bankinheritance.java;

public class CurrentAccount extends Account {
	
	final double overdraft=4000;

	public CurrentAccount(Person accHolder) {
		super(accHolder);
	}

	@Override
	Boolean withdraw(double amount) {
		
		if(amount>overdraft) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
	
	
	
	
	
	
}
