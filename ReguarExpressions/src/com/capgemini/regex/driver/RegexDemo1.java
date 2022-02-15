package com.capgemini.regex.driver;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Pattern:");
		Pattern pattern = Pattern.compile(scanner.nextLine(),Pattern.CASE_INSENSITIVE);
		
		System.out.println("Enter the String to match the pattern:");
		Matcher matcher = pattern.matcher(scanner.nextLine());
		boolean result = matcher.find();
		if(result){
			System.out.println("Pattern Matched..");
		}else {
			System.out.println("Pattern not found");
		}

	}

}
