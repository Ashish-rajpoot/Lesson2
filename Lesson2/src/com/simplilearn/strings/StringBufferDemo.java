package com.simplilearn.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		buffer.append("Hello");
		System.out.println(buffer.capacity());
		buffer.replace(1, 3, "a");
		System.out.println(buffer);
		buffer.delete(2, 2);
		System.out.println(buffer);
		//insert
		buffer.insert(1, "HH");
		buffer.reverse();
		System.out.println(buffer);
		//(old capacity * 2) +  2
		
		
		String s1 = "welcome";
		StringBuilder strBuilder = new StringBuilder(s1);
		System.out.println(strBuilder);
	}

}
