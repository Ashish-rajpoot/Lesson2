package com.simplilearn.sum;

import java.util.Scanner;

public class Student {
	String name;
	int StudentId;
	boolean AssesmentStatus;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int studentId) {
		this.name = name;
		this.StudentId = studentId;
	}

	public Student(String name, int studentId, boolean assesmentStatus) {
		this.name = name;
		this.StudentId = studentId;
		this.AssesmentStatus = assesmentStatus;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", StudentId=" + StudentId + ", AssesmentStatus=" + AssesmentStatus + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student);
		
		Student student1 = new Student("ashish", 5555);
		System.out.println(student1);
		
		Student student2 = new Student("ashish",5858,true);
		System.out.println(student2);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = scanner.next();
		System.out.println("Enter the ID : ");
		int StudentId = scanner.nextInt();
		Student student3 = new Student(name, StudentId, true);
		System.out.println(student3);
		System.out.println("Recently add this project to github000");
	}

}
