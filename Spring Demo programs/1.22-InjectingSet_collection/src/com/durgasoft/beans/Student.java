package com.durgasoft.beans;

import java.util.Set;

public class Student
{
	private String sid;
	private String sname;

	// Set of Courese
	private Set<String> courses;
	

	public void setCourses(Set<String> courses)
	{
		this.courses = courses;
	}

	// constructor
	public Student() {
	
	public void setSid(String sid)
	{
		this.sid = sid;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("-------------------------");
		System.out.println("Sid        :" + sid);
		System.out.println("sname      :" + sname);
		System.out.println("*********Student Courses***********");
		for (String c : courses)
		{
			System.out.println(c);
		}
		System.out.println();
	}

}
