package in.ineuron.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

//Step 1: coding dependent Class
@Entity
public class Employee
{
	// 1.1 : declaring instance variables
	@Id
	private Integer eid;
	private String ename;

	public Employee()
	{
		System.out.println("Used by Hibernate internally"+this.getClass().getName());
	}

	// 1.2 : Generating Constructors to perform constructor Injection
	public Employee(Integer eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

	// 1.3 : Generating Getters for displaying values inside TARGET object
	public Integer getEid()
	{
		return eid;
	}

	public String getEname()
	{
		return ename;
	}

}