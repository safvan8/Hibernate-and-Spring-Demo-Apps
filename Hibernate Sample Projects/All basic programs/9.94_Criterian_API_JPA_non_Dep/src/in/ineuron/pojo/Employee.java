package in.ineuron.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	
	@Column(name="ename")
	private String ename;
	private Double esalary;
	private String eaddress;

	public Integer getEid()
	{
		return eid;
	}

	public void setEid(Integer eid)
	{
		this.eid = eid;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public Double getEsalary()
	{
		return esalary;
	}

	public void setEsalary(Double esalary)
	{
		this.esalary = esalary;
	}

	public String getEaddress()
	{
		return eaddress;
	}

	@Override
	public String toString()
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress + "]";
	}

	public void setEaddress(String eaddress)
	{
		this.eaddress = eaddress;
	}
}
