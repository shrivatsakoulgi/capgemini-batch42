package com.capgemini.regex.driver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		Pattern pattern  = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher("Todays 2 date is 15-02-2022.");
	
		boolean result = matcher.find();
		if(result){
			System.out.println("Number found..");
		}else {
			System.out.println("Number NOT found..");
		}
		
		Pattern pattern2 = Pattern.compile("s..$");
		Matcher matcher2 = pattern2.matcher("Apple");
		if(matcher2.find()){
			System.out.println("Last 3rd char is s");
		}else{
			System.out.println("Last 3rd char is not s");
		}
		
		boolean startsWithS = Pattern.compile("^s").matcher("surprise").find();
		
		boolean secondCharA = Pattern.compile("^.a").matcher("Happy").find();
		
		System.out.println(startsWithS+" "+secondCharA);
	}

}
