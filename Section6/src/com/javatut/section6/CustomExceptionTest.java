package com.javatut.section6;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.javatut.section6.exception.CustomException;

public class CustomExceptionTest {

	public static void main(String[] args) {

		try {
			FileReader fr1 = openFile("test2.txt");
		} catch (CustomException e) {
			System.out.println(e);
		}
		
	}
	
	public static FileReader openFile(String fileName) throws CustomException {
		
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			throw new CustomException(100, "File " + fileName + " not found!");
		}
		
		return fr;
	}

}
