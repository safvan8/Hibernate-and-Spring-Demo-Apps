package in.ineuron.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//Step 2: coding Target class
@Entity
public class Student
{
	// 2.1: declaring instance variables
	@Id

	private Integer sid;
	private String sname;
	private Integer sage;

	// 2.2: declaring HAS-A variable for Many to One association ( no need of
	// array)-
	// array required only when target class want's to receive multiple objects from
	// dependent class
	// in this case, Many is in TARGET side and we don't need to receive multiple
	// objects from dependednt class,
// we need only only One department Object from DEPENDENT Object
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Branch branch;

	public Student()
	{
		System.out.println("Used by Hibernate Internally --" + this.getClass().getName());

	}

	// 2.3: Generating constructors to perform Constructor Injection
	public Student(Integer sid, String sname, Integer sage, Branch branch)
	{
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;

		// HAS-A variable injection through constructor
		this.branch = branch;
	}

	// using toString method to display all the values in the object

	@Override // we can also create a display method if you want
	public String toString()
	{
		System.out.println();
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "," + " branchId=" + branch.getBranchId()
				+ ", branchLoc=" + branch.getBranchLoc() + "]";
	}

}