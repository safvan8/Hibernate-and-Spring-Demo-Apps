package in.ineuron.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

//step1: coding dependent class
@Entity
public class Course
{

	// 1.1: Declaring instance variables
	@Id
	private String cid;
	private String cname;
	private Integer cost;

	public Course()
	{
		System.out.println("------used by hibernate internallt" + this.getClass().getName());
	}

	// 1.2: Generating constructors to perform constructor injection
	public Course(String cid, String cname, Integer cost)
	{
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	// 1.3 : Generating Getters for getting values inside TARGET object

	public String getCid()
	{
		return cid;
	}

	public String getCname()
	{
		return cname;
	}

	public Integer getCost()
	{
		return cost;
	}

}