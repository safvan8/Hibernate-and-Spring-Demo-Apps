package com.durgasoft.pojo;

public class Employee
{
	private Integer eno;
	private String ename;
	private Float esal;
	private String eaddr;

	public Integer getEno()
	{
		System.out.println("Employee.getEno()...." + eno);
		return eno;
	}

	public void setEno(Integer eno)
	{
		System.out.println("Employee.setEno()..."+eno);
		this.eno = eno;
	}

	public String getEname()
	{
		System.out.println("Employee.getEname()......" + ename);
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public Float getEsal()
	{
		System.out.println("Employee.getEsal()...." + esal);
		return esal;
	}

	public void setEsal(Float esal)
	{
		this.esal = esal;
	}

	public String getEaddr()
	{
		System.out.println("Employee.getEaddr()...." + eaddr);
		return eaddr;
	}

	public void setEaddr(String eaddr)
	{
		this.eaddr = eaddr;
	}

	@Override
	public String toString()
	{
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}

}
