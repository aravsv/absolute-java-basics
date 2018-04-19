package com.javatut.section7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John");
		names.add("Matt");
		names.add("Kate");
		names.add("Peter");
		
		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
		}

	}

}
