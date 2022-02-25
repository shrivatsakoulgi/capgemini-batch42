package com.capgemini.property.driver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
	
	public static void main(String []args) throws IOException{
	
		Properties props = new Properties();
		props.setProperty("movie_name", "Spider Man:No Way Home");
		props.setProperty("year", "2022");
		props.setProperty("franchise", "Marvel");
		props.setProperty("category", "Action,Super Hero");
		props.setProperty("imdb", "9.3");
		
		FileWriter writer = new FileWriter("movie.properties"); 
		System.out.println(props);
		props.store(writer, "Property file for a Movie");
		
		System.out.println(props.get("franchise"));
		
	}

}
