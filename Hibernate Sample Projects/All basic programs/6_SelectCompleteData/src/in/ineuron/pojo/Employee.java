package in.ineuron.pojo;

public class Employee
{
	private Integer eno;

	private String ename;

	private String eaddr;

	private Integer esal;

	static
	{
		System.out.println("Employee class loading...");
	}

	public Employee()
	{
		System.out.println("Employee instantiation....");
	}

	// no need of setters and getters while we are using annottaions.
	// because internally it is uisng reflection API, to set and get properties

	public Integer getEno()
	{
		System.out.println("Employee.getEno()");
		return eno;
	}

	public void setEno(Integer eno)
	{
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}

	public String getEname()
	{
		System.out.println("Employee.getEname()");
		return ename;
	}

	public void setEname(String ename)
	{
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}

	public String getEaddr()
	{
		System.out.println("Employee.getEaddr()");
		return eaddr;
	}

	public void setEaddr(String eaddr)
	{
		System.out.println("Employee.setEaddr()");
		this.eaddr = eaddr;
	}

	public Integer getEsal()
	{
		System.out.println("Employee.getEsal()");
		return esal;
	}

	public void setEsal(Integer esal)
	{
		System.out.println("Employee.setEsal()");
		this.esal = esal;
	}

	@Override
	public String toString()
	{
		System.out.println("Employee.toString()");
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddr=" + eaddr + ", esal=" + esal + "]";
	}

}
