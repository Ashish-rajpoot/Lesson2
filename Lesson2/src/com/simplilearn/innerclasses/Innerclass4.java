package com.simplilearn.innerclasses;

public class Innerclass4 {

	static class Inner {
		public void dispaly() {
			System.out.println("I am inside static method of Inner class");
		}
	}
	public static void main(String[] args) {
		Innerclass4.Inner inner = new Innerclass4.Inner();
		inner.dispaly();
		
	}

}
