package com.javatut.section4;

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager mgr1 = new Manager("Patty", "Senior Manager", 30000, 10);
		
		System.out.println(mgr1);
		System.out.println("Bonus for mgr1 : " + mgr1.calculateBonus());
		
		Employee emp1 = new Manager("John", "Manager", 25000, 5);
		System.out.println("Bonus for emp1 : " + emp1.calculateBonus());

	}

}
