package com.javatut.section4;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", "Analyst", 10000);
		
		System.out.println(emp1.getName());
		emp1.setName("Tina");
		System.out.println(emp1.getName());
		
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		
	}

}
