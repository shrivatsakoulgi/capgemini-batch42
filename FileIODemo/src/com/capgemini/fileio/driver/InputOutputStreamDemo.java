package com.capgemini.fileio.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamDemo {

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream out = new FileOutputStream("file.txt");
			String text = "This is my First program for File IO.\n"
					+ "Welcome to file programming";
			out.write(text.getBytes());
			System.out.println("Contents written to the file.");
			out.close();
			
			FileInputStream in = new FileInputStream("file.txt");
			byte []fileContents = new byte[in.available()];
			in.read(fileContents);
			String contents = new String(fileContents);
			System.out.println("File Contents:");
			System.out.println(contents);
			in.close();	
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}
