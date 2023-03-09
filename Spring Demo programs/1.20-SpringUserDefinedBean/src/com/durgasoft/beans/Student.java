package com.durgasoft.beans;

import java.util.List;

// Target class
public class Student
{
	private String sid;
	private String sname;
	// Has A Varaible
	private Address address;

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

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public void getStudentDetails()
	{
		System.out.println("Student Details");
		System.out.println("-------------------------");
		System.out.println("Sid        :" + sid);
		System.out.println("sname      :" + sname);
		System.out.println("Address Details");
		System.out.println("****************************");
		System.out.println("Flat Number:" + address.getFlatNo());
		System.out.println("City       :" + address.getCity());
		System.out.println("Pin code   :" + address.getPinCode());
	}

}
