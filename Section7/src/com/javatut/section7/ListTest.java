package com.javatut.section7;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("John");
		names.add("Kate");
		names.add("Peter");
		
		names.remove(1);
		
		names.add(1, "Kate");
		
		
		//names.
		
		System.out.println(names.size());
		
		System.out.println(names.get(1));

	}

}
