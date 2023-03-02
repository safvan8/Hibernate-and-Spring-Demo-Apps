package in.ineuron.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//Step 2: coding Target class
@Entity
public class Employee
{
	// 2.1: declaring instance variables

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	private String eskill;

	// 2.2: declaring HAS-A variable for one to One association
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;

	// 2.3: Generating constructors to perform Constructor Injection

	
	public Employee()
	{
		
	}
	
	public Employee(String ename, String eskill, Account account)
	{
		System.out.println("Employee constructor:  ( constructor injection ) ");
		this.ename = ename;
		this.eskill = eskill;
		// HAS - A variable injection
		this.account = account;

	}

	// 2.4 To display all the details of the employee
	public void display()
	{
		System.out.println("************EMPLOYEE DETAILS ARE********** ");
		System.out.println("Eid is:: " + eid);
		System.out.println("Employee name is :: " + ename);
		System.out.println("Employee skill is :: " + eskill);

		System.out.println("************ACCOUNT DETAILS ARE************");
		System.out.println("Account num is:: " + account.getAccNo()); // calling getters
		System.out.println("Account type is:: " + account.getAccType());
		System.out.println("Account Holder name is :: " + account.getAccHolderName());
	}

}