package com.durgasoft.pojo;

public class Employee
{
	private Integer eno;
	private String ename;
	private Float esal;
	private String eaddr;

	// getters
	public Integer getEno()
	{
		System.out.println("Employee.getEno()");
		return eno;
	}

	public void setEno(Integer eno)
	{
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}

	public String getEname()
	{
		System.out.println("Employee.getName()");
		return ename;
	}

	// setters
	public void setEname(String ename)
	{
		System.out.println("Employee.setName()");
		this.ename = ename;
	}

	public Float getEsal()
	{
		System.out.println("Employee.getEsal()");
		return esal;
	}

	public void setEsal(Float esal)
	{
		System.out.println("Employee.setEsal()");
		this.esal = esal;
	}

	public String getEaddr()
	{
		System.out.println("Employee.getEaddr()");
		return eaddr;
	}

	public void setEaddr(String eaddr)
	{
		System.out.println("Employee.setEaddr()");
		this.eaddr = eaddr;
	}
}
