package in.ineuron.bean;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component("tr")
public class Target
{
	@Autowired
	@Nullable // non need of insertion
	private LocalDate localDate;

	//mandatory injection 
	@Autowired
	@Required // made as Mandatory 
	private Date utilDate;
	
	static
	{
		System.out.println("Target.class file is loading...........");

	}

	public Target()
	{
		System.out.println("Target zero param constrcuctor.......");
	}

}
