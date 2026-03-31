package com.day4;

public class Delhi extends Bank {
	
	public boolean validateDocument(String document) {
		if(document.equalsIgnoreCase("Passport")) {
			return true;
		}
		else {
			return false;
		}
	}


	public static void main(String[] args) {
		Delhi d1 = new Delhi();
		d1.createAccount("EB");

		Delhi d2 = new Delhi();
		d2.createAccount("passport");
	}

}
