package com.durgasoft.beans;

import java.util.Properties;

public class Student
{
	private String sname;

	// to inject properties Collection
	private Properties courseAndCost;

	public void setCourseAndCost(Properties courseAndCost)
	{
		this.courseAndCost = courseAndCost;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	// constructor
	public Student()
	{
	}

	public void getStudentDetails()
	{
		System.out.println("Student name: " + sname);
		System.out.println("Student Course and cost :" + courseAndCost);
	}
}
