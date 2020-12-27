package com.simplilearn.arrays;

import java.util.Scanner;

public class SearchDemo {

	public static void main(String[] args) {
		String countries[] = {"India","US","Australia","Canada"};
		System.out.println(countries.length);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a Country : ");
			String input = scanner.next();
			searchCountry(countries, input);
		}
	}

	private static void searchCountry(String[] countries, String input) {
		boolean isFound = false;
		for(String country: countries) {
			if(country.equals(input)) {
				isFound = true;
				break;				
			}			
		}
		if(isFound) {
			System.out.println("found");
			System.exit(0);
		}else {
			System.out.println("Not found!");
		}
	}

}
