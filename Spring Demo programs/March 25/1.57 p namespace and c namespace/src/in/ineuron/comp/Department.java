package in.ineuron.comp;

import java.util.Date;

// Dependent Object
public class Department {
	
	private int dno;
	private String dname;
	private Date dos;

	// Constructor injection
	public Department(int dno, String dname, Date dos) {
		System.out.println("Department:: Constructor Injection...");
		this.dno = dno;
		this.dname = dname;
		this.dos = dos;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", dos=" + dos + "]";
	}

}
