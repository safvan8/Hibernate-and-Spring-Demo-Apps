package in.ineuron.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

//Step 1: coding dependent Class
@Entity
public class Branch // one Branch near students to join an offline course
{
	// 1.1 : declaring instance variables
	@Id
	private String branchId;
	private String branchLoc;

	public Branch()
	{
		System.out.println("Used by Hibernate Internally --" + this.getClass().getName());
	}

	// 1.2 : Generating Constructors to perform constructor Injection
	public Branch(String branchId, String branchLoc)
	{
		this.branchId = branchId;
		this.branchLoc = branchLoc;
	}

	// 1.3 : Generating Getters for getting values inside TARGET object
	public String getBranchId()
	{
		return branchId;
	}

	public String getBranchLoc()
	{
		return branchLoc;
	}

}