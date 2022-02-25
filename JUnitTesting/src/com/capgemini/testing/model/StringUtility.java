package com.capgemini.testing.model;

public class StringUtility {
	
	public int getLength(String str){
		return str.length();
	}
	
	public String getUpperCase(String str){
		return str.toUpperCase();
	}
	
	public String getLowerCase(String str){
		return str.toLowerCase();
	}
	
	public String [] splitString(String str){
		return str.split(" ");
	}

}
