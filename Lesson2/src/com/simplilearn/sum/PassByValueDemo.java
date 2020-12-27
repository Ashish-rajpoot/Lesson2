package com.simplilearn.sum;

public class PassByValueDemo {
	
	int value = 100;
	
	private  int changeValue(int a) {
		this.value = a + 100;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValueDemo byValueDemo = new PassByValueDemo();
		System.out.println("Before calling the method Value of variable value is : " + byValueDemo.value);
		byValueDemo.changeValue(byValueDemo.value);
		System.out.println("Before calling the method Value of variable value is : " + byValueDemo.value);
	}

}
