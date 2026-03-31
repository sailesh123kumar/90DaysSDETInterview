package com.day4;

public abstract class Bank {
	
	private static final String BANK_NAME = "HDFC BANK";
	
	public void createAccount(String document) {
		if(validateDocument(document)) {
			System.out.println("Creating the account with the document...."+document);
			System.out.println("Account Created Successfuly");
		}else {
			System.out.println("Invalid Document..."+document);
		}
		
	}
	
	public abstract boolean validateDocument(String document) ;

}
