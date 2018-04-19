package com.javatut.section6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsTest {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		//Checked Exceptions
		try {
			FileReader file = new FileReader("test.txt");
			
			reader = new BufferedReader(file);
			
			System.out.println(reader.readLine());
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File test.txt could not be found");
		} catch (IOException ioex) {
			System.out.println("Cannot read file");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {	}
				
				System.out.println("Completed reading the file");
			}
		}
		System.out.println("Done");

	}

}
