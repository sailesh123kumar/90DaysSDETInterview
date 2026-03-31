package com.day2;

public class EmpRunner {
	
	public static void main(String[] args) {
		
		Emp e1;
		e1= new Emp.Builder()
				.setCompanyName("Accenture")
				.setEmpId("101")
				.setEmpName("Sailesh")
				.setProject("Non Financial Banking")
				.setSalary(1000)
				.build();
		
		System.out.println(e1);
		
	}

}
