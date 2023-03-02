package in.ineuron.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Set;

//Step 2: coding Target class
@Entity
public class Department
{
	// 2.1: declaring instance variables
	@Id
	private Integer deptNo;
	private String deptName;
	private String deptLoc;
	
	// 2.2: declaring HAS-A variable for one to Many association
	@OneToMany(cascade = CascadeType.ALL)
	Set<Employee> employees;   // one department has many Employees
	
	
	public Department()
	{
		System.out.println("used by Hibernate internally"+this.getClass().getName());
	}
	
	// 2.3: Generating constructors to perform Constructor Injection
	public Department(Integer deptNo, String deptName, String deptLoc, Set<Employee> employees)
	{
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		
		// HAS-A variable injection through constructor
		this.employees = employees;
	}
	
	// 2.4 To display all the details of the employee
	public void display()
	{
		System.out.println("********************DEPARTMENT DETAILS ARE **********************");
		System.out.println("dept No: :"+ deptNo);
		System.out.println("Department name:: "+ deptName);
		System.out.println("Department Location:: "+deptLoc);
		
		System.out.println("******************EMPLOYEEE DETAILS******************");
		for(Employee employee: employees)
		{
			System.out.println(" emp id is: "+ employee.getEid());
			System.out.println("emp name is: "+employee.getEname());
			System.out.println("************\n");
		}
	}
	
}