package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("kolkata");
		cities.add("Allahabad");
		cities.add("Mahoba");
		cities.add("Pawa");
		cities.add("Lauri");
		System.out.println(cities);
		Collections.sort(cities);
		System.out.println(cities);
		for (String city : cities) {
			System.out.println(city);
		}
	}

}
