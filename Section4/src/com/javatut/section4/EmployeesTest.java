package com.javatut.section4;

public class EmployeesTest {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[5];
		
		System.out.println(employees.length);
		
		employees[0] = new Employee("John", "Analyst", 10000);
		employees[1] = new Employee("Mary", "Developer", 40000);
				
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		

	}

}
