package com.day3;
import static com.day3.Account.BANK_NAME;

public class Runner {

	
	public static void main(String[] args) {
		
		
		Account a1 = new Account();
		a1.setName("sailesh");
		a1.setBalance(1000);
		System.out.println(BANK_NAME);
		System.out.println(a1);
		
		
		Account a2 = new Account();
		a2.setName("Katrina");
		a2.setBalance(-1);
		System.out.println(a2);
		
		Account a3 = new Account("Jatin", 12000);
		System.out.println(a3);
		
	}
}
