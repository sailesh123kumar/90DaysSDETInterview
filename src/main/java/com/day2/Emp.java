package com.day2;

public class Emp {

	private String empName;
	private String empId;
	private String project;
	private double salary;
	private String companyName;

	private Emp(String empName, String empId, String project, double salary, String companyName) {
		super(); // call the parent class constructor - Default parent Object - Constructor
					// chaining
		this.empName = empName;
		this.empId = empId;
		this.project = project;
		this.salary = salary;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empId=" + empId + ", project=" + project + ", salary=" + salary
				+ ", companyName=" + companyName + "]";
	}

	public static class Builder {

		private String empName;
		private String empId;
		private String project;
		private double salary;
		private String companyName;

		public Builder setEmpName(String empName) {
			this.empName = empName;
			return this;
		}

		public Builder setEmpId(String empId) {
			this.empId = empId;
			return this;
		}

		public Builder setProject(String project) {
			this.project = project;
			return this;
		}

		public Builder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Builder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}
		
		public Emp build() {
			Emp emp = new Emp(empName, empId, project, salary, companyName);
			return emp;
		}

	}

}
