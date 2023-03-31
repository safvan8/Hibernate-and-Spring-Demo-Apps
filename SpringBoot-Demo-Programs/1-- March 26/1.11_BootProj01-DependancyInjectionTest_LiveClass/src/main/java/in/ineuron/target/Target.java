package in.ineuron.target;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tr")
public class Target
{
	// Dependent HAS-A variable
	@Autowired
	private LocalDate date;

	static
	{
		System.out.println("Target class.file is loading.......");
	}

	public Target()
	{
		System.out.println("Target class Object creation  : zero arg Constructor");
	}

	@Override
	public String toString()
	{
		return "Target [date=" + date + "]";
	}
}