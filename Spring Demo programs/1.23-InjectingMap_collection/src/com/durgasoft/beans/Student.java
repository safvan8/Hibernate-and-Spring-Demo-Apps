package com.durgasoft.beans;

import java.util.Map;

public class Student
{
	private String sname;

	// to inject and values
	private Map<String, String> footabllersAndClubs;

	public Map<String, String> getFootabllersAndClubs()
	{
		return footabllersAndClubs;
	}

	public void setFootabllersAndClubs(Map<String, String> footabllersAndClubs)
	{
		this.footabllersAndClubs = footabllersAndClubs;
	}

	// constructor
	public Student()
	{
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("-------------------------");
		System.out.println("sname      :" + sname);
		System.out.println("*********Footballer and their clubs***********");
		System.out.println("Footballers and clubs :" + footabllersAndClubs);
	}
}
