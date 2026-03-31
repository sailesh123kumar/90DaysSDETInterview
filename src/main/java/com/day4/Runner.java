package com.day4;

public class Runner {

	
	public static void main(String[] args) {
		
		Bank hdfcbank1 = new Mumbai();
		hdfcbank1.createAccount("Adhaar card");
		
		Bank hdfcbank2 = new Mumbai();
		hdfcbank1.createAccount("EB");
		
		Bank hdfcbank3 = new Mumbai();
		hdfcbank1.createAccount("passport");
		
		Bank hdfcbank4 = new Delhi();
		hdfcbank1.createAccount("EB");
		
	}
}
