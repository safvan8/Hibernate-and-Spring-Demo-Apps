package com.durgasoft.beans;

import java.util.List;

public class Student
{
	private String sid;
	private String sname;

	// List of Values
	private List<String> favFootballers;

	public List<String> getFavFootballers()
	{
		return favFootballers;
	}

	public void setFavFootballers(List<String> favFootballers)
	{
		this.favFootballers = favFootballers;
	}

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
		System.out.println("*********Favorite Footballers***********");
		for (String s : favFootballers)
		{
			System.out.println(s );
		}
		System.out.println();
	}

}
