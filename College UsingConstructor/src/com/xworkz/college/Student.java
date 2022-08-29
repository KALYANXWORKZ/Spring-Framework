package com.xworkz.college;

public class Student {

	private int id;
	private String studentName;

	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public Student(int id) {
		super();
		this.id = id;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is "+studentName+ "and the id is "+id);
	}

}
