package in.ineuron.comp;

import java.util.Date;

//Target object Object
public class Employee {
	private int eno;
	private String ename;
	private Date dob;
	// HAS_A Variable -- setter injection
	private Department dept;

	public void setEno(int eno) {
		System.out.println("Employee::Setter Injection...");
		this.eno = eno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", dept=" + dept + "]";
	}

}
