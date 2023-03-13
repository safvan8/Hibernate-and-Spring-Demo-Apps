package in.ineuron.Model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	static {
		System.out.println("Employee.class file is loading...");
	}

	public Employee() {
		System.out.println("Employee Object is instantiated...");
	}

	private Integer eno;

	private String ename;

	private String eaddr;

	private Integer esalary;

	public Integer getEno() {
		System.out.println("Employee.getEno()");
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
		System.out.println("Employee.setEno()");
	}

	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("Employee.setEname()");
	}

	public String getEaddr() {
		System.out.println("Employee.getEaddr()");
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
		System.out.println("Employee.setEaddr()");
	}

	public Integer getEsalary() {
		System.out.println("Employee.getEsalary()");
		return esalary;
	}

	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
		System.out.println("Employee.setEsalary()");
	}

	@Override
	public String toString() {
		System.out.println("Employee.toString()");
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddr=" + eaddr + ", esalary=" + esalary + "]";
	}

}
