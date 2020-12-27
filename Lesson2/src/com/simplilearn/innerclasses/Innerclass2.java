package com.simplilearn.innerclasses;

public class Innerclass2 {
	
	private String message = "Welcome to java";

	public void display() {
		class Inner {
			String hello = "Hello wonderful learners";
			
			void greet() {
				System.out.println(hello + ", "+message);
			}
		}
		Inner inner = new Inner();
		inner.greet();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerclass2 innerclass2 = new Innerclass2();
		innerclass2.display();
	}

}