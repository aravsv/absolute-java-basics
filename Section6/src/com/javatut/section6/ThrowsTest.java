package com.javatut.section6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) {

		try {
			FileReader fr = openFile("test1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File test1.txt not found!!");
		}
		
	}
	
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		FileReader fr = new FileReader(fileName);
		return fr;
	}

}
