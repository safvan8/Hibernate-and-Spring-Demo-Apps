package in.ineuron.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//Step 1: coding dependent Class
public class Account
{
	// 1.1 : declaring instance variables
	@Id
	private String accNo;
	private String accType;
	private String accHolderName;

	public Account()
	{
		System.out.println("Zero ar constrcutor used by Hibernate");
	}

	// 1.2 : Generating Constructors to perform constructor Injection
	public Account(String accNo, String accType, String accHolderName)
	{
		System.out.println("Account constructor: ( constructor injection ) ");
		this.accNo = accNo;
		this.accType = accType;
		this.accHolderName = accHolderName;
	}

	// 1.3 : Generating Getters for displaying values outside object
	public String getAccNo()
	{
		return accNo;
	}

	public String getAccType()
	{
		return accType;
	}

	public String getAccHolderName()
	{
		return accHolderName;
	}
}