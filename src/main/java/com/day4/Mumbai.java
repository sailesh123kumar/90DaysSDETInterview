package com.day4;

public class Mumbai extends Bank {
	
	public boolean validateDocument(String document) {
		if(document.equalsIgnoreCase("EB")) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		Mumbai m1 = new Mumbai();
		m1.createAccount("passport");
		
		Mumbai m2 = new Mumbai();
		m1.createAccount("eb");
	}

}
