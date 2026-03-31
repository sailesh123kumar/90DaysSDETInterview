package com.day3;

public class Account {
	
	
	private String name;
	private double balance;
	public static final String BANK_NAME;
	
	
	static {
		BANK_NAME= "HDFC BANK";
	}
	
	public Account() {
		
	}
	
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}



	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		if(balance<0) {
			System.out.println("Amount cannot be less than 0 or negative"); 
		} else {
			this.balance = balance;
		}
		
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

	
	
	

}
