package in.ineuron.Target;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("tr")
@Lazy(value = true)
public class Target
{	
	private Date utilDate;

	@Autowired
	public void setUtilDate(Date utilDate)
	{
		System.out.println("Target.setUtilDate()");
		this.utilDate = utilDate;
	}

	static
	{
		System.out.println("Target.class file is loading...........");
	}

	public Target() // Zero arg constructor is not mandatory in setter injection
	{ // IOC is using Reflection API
		System.out.println("Target instantaion.............Zero param constrctor");
	}

	@Override
	public String toString()
	{
		return "Target [utilDate=" + utilDate + "]";
	}
}
