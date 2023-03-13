package in.ineuron.pojo;

public class Employee
{
	private Integer eno;
	private String ename;
	private String eaddr;
	private Integer esal;

	public Integer getEno()
	{
		return eno;
	}

	public void setEno(Integer eno)
	{
		this.eno = eno;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public String getEaddr()
	{
		return eaddr;
	}

	public void setEaddr(String eaddr)
	{
		this.eaddr = eaddr;
	}

	public Integer getEsal()
	{
		return esal;
	}

	public void setEsal(Integer esal)
	{
		this.esal = esal;
	}

	@Override
	public String toString()
	{
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddr=" + eaddr + ", esal=" + esal + "]";
	}

}
