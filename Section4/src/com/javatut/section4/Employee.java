package com.javatut.section4;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double salary;
	//protected String department;
	//String location;
	
	public static final String COMPANY_NAME = "ABC";
	
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle
				+ ", salary=" + salary + "]";
	}
	
	public double calculateBonus() {
		return 0;
	}

}
