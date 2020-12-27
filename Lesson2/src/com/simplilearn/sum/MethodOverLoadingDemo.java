package com.simplilearn.sum;

public class MethodOverLoadingDemo {

	private void area(int length, int width) {
		System.out.println("Area of Rectangle : " + (length * width));
	}
	public void area(int radius) {
		System.out.println("Area of circle : " + (Math.PI * radius * radius));
	}
	 void area(double side) {
		System.out.println("Area of Square : " + (side * side));
	}
	 
	 public static void main(String[] args) {
		int length = 10, width = 12, radius = 7;
		double side = 11.1;
		
		MethodOverLoadingDemo methodOverLoadingDemo = new MethodOverLoadingDemo();
		methodOverLoadingDemo.area(length, width);
		methodOverLoadingDemo.area(radius);
		methodOverLoadingDemo.area(side);
	}
}
