package com.capgemini.fileio.driver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("java.txt");
		System.out.println("File Details:"+file.getAbsolutePath());
		
		FileWriter fw = new FileWriter(file,true);		// 2nd arg indicates to open
														// in append mode
		
		fw.write("This is File Contents.\n");
		fw.write("This is Second Line.\n");
		fw.write("This is Third Line.");
		fw.flush();
		fw.close();
		
		FileReader reader = new FileReader(file);
		char []contents = new char[(int)file.length()];
		reader.read(contents);
		String str = new String(contents);
		System.out.println("File contents are:\n");
		System.out.println(str);
		reader.close();

	}

}
