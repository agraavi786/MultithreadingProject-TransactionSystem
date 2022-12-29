package com.atm;

public class Account {
	
	private long balance=60000;
	
	public long getBalance() {
		return balance;
	}
	public void withdrow(long amount) {
		balance=balance-amount;
	}

}
