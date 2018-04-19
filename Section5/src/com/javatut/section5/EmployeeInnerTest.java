package com.javatut.section5;

import com.javatut.section5.Employee.Name;

public class EmployeeInnerTest {

	public static void main(String[] args) {
		Employee emp = new Employee("John", "A", "Appleseed");
		
		Employee.Name name = emp.new Name("Mark", "A", "Johnson");
	}

}
