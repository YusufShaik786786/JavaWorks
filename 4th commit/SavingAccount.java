package com.bankinheritance.java;

public class SavingAccount extends Account {
	final double minBalance = 500;

	public SavingAccount(Person accHolder) {
		super(accHolder);
	}

	@Override
	public void setAccNum(long accNum) {
		super.setAccNum(accNum);
	}

	@Override
	Boolean withdraw(double amount) {
		if (super.getBalance() > minBalance) {
			super.withdraw(amount);
			return true;
		} else {
			return false;
		}
	}
	

}
