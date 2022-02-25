package com.capgemini.property.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputStream = new FileInputStream("movie.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		
		System.out.println("movie_name:"+prop.getProperty("movie_name"));
		System.out.println("year:"+prop.getProperty("year"));
		System.out.println("franchise:"+prop.getProperty("franchise"));
		System.out.println("category:"+prop.getProperty("category"));
		System.out.println("imdb:"+prop.getProperty("imdb"));
		
		System.out.println("\nUsing KeySet of Properties..\n");
		Set<Object> keys = prop.keySet();
		for(Object k:keys){
			
			String key =(String) k;
			System.out.println(key+":"+prop.getProperty(key));
		}

	}

}
