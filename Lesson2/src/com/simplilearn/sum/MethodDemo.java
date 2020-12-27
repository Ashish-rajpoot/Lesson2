package com.simplilearn.sum;

public class MethodDemo {
	
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int input1 = 10, input2 = 20;
		MethodDemo demo = new MethodDemo();
		int result = demo.sum(input1, input2);
		System.out.println("Result : " + result);
	}
}
