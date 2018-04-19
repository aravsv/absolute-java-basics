package com.javatut.section5;

public class Employee {
	
	public class Name {
		private String firstName;
		private String middleName;
		private String lastName;
		
		public Name(String firstName, String middleName, String lastName) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
		}
	}
	
	private Name name;
	
	public Employee(String firstName, String middleName, String lastName) {
		this.name = new Name(firstName, middleName, lastName);
	}

}
