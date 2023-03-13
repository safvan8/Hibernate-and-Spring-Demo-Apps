package in.ineuron.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "schooldbo.emptab")
public class Employee 
{
	@Id
	@Column(name = "eid")

	private Integer empId;

	@Column(name = "ename")
	private String empName;

	@Column(name = "esal")
	private Double empSal;

	public Employee()
	{
		System.out.println("Employee Obj created : Zero arg Contructor");
	}

	public Integer getEmpId()
	{
		System.out.println("Employee.getEmpId()......"+empId);
		return empId;
	}

	public void setEmpId(Integer empId)
	{
		this.empId = empId;
	}

	public String getEmpName()
	{
		System.out.println("Employee.getEmpName()......"+empName);
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public Double getEmpSal()
	{
		System.out.println("Employee.getEmpSal()......"+empSal);
		return empSal;
	}

	public void setEmpSal(Double empSal)
	{
		this.empSal = empSal;
	}

	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
