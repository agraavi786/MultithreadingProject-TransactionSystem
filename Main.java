package com.atm;

public class Main {

	public static void main(String[] args) {
		//Account aco= new Account();
		AccountHolder a= new AccountHolder();
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		Thread t3= new Thread(a);
		t1.setName("Avaneet");
		t2.setName("Agrahari");
		t3.setName("ANu");
		
		t1.start();
		t2.start();
//		t3.start();

	}

}
