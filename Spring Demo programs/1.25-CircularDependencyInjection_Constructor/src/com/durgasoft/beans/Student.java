package com.durgasoft.beans;

// Student object is dependent on Branch object
public class Student
{
	private Branch branch;

	public Student(Branch branch)
	{
		this.branch = branch;
	}

	public String getStudent()
	{
		return "Safvan";
	}
}