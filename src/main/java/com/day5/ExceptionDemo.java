package com.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		FileReader fr;
		try {
			 fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
