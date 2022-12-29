package com.atm;

import java.util.Scanner;

public class AccountHolder implements Runnable {
	
	 Account acc= new Account();
	
//	public AccountHolder(Account acc) {
//		this.acc=acc;
//	}
	
	

	@Override
	public void run() {
		for(int i=0;i<4;i++) {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Please enter your ammount");
//			long d=sc.nextLong();
			
		makeWithdrawal(2000);
		
		if(acc.getBalance()<0) {
			System.out.println(" we dont have sufficient balance");
			
		}
		}
		
		
		
	}
	
	private synchronized void makeWithdrawal(long ammount) {
		
		if(acc.getBalance()>=ammount) {
			System.out.println(Thread.currentThread().getName()+"is going to withdrawal with "+ ammount+" Rupiee");
			System.out.println("Transcation done");
			acc.withdrow(ammount);
			
			System.out.println("Remaining balance is  : " + acc.getBalance());
		
			
		}
		else {
			System.out.println(Thread.currentThread().getName()+ " we dont have sufficient balance" + " Remaining balance is : " + acc.getBalance());
		}
		
	}

}
